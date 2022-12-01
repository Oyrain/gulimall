package com.oyrain.gulimall.order.dao;

import com.oyrain.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-12-01 21:03:43
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
