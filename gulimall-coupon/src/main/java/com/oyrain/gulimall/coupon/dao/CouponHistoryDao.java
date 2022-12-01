package com.oyrain.gulimall.coupon.dao;

import com.oyrain.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-11-30 23:46:33
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
