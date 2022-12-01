package com.oyrain.gulimall.ware.dao;

import com.oyrain.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-12-01 00:06:48
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
