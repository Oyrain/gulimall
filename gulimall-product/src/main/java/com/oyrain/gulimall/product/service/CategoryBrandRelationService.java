package com.oyrain.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyrain.common.utils.PageUtils;
import com.oyrain.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-11-30 21:43:26
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

