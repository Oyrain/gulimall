package com.oyrain.gulimall.product.service.impl;

import com.oyrain.common.utils.PageUtils;
import com.oyrain.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.oyrain.gulimall.product.dao.CategoryDao;
import com.oyrain.gulimall.product.entity.CategoryEntity;
import com.oyrain.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 三级分类
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 1.查询所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        // 2.组装成父子的属性结构
        // 2.1找到所有的一级分类
        List<CategoryEntity> levelOneMenu = categoryEntities.stream().filter(categoryEntity ->
            categoryEntity.getParentCid() == 0
        ).map( (menu)->{
            menu.setChildrens(getChildrens(menu,categoryEntities));
            return menu;
        } ).sorted( (menu1,menu2) -> {
            return menu1.getSort() - menu2.getSort();
        } ).collect(Collectors.toList());

        return levelOneMenu;
    }


    /**
     * 递归查找所有分类的子分类
     * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all) {
        List<CategoryEntity> childrens = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            // 1.找到主菜单
            categoryEntity.setChildrens(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            // 2.菜单的排序
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return childrens;
    }

}