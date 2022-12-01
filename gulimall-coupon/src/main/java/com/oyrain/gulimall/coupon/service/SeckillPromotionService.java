package com.oyrain.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyrain.common.utils.PageUtils;
import com.oyrain.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-11-30 23:46:33
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

