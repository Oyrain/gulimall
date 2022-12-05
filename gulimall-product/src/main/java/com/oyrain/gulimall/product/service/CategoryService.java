package com.oyrain.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyrain.common.utils.PageUtils;
import com.oyrain.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-11-30 21:43:26
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    //三级分类
    List<CategoryEntity> listWithTree();
}

