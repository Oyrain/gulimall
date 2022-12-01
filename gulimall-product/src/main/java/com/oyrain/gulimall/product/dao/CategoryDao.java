package com.oyrain.gulimall.product.dao;

import com.oyrain.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-11-30 21:43:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
