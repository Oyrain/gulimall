package com.oyrain.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyrain.common.utils.PageUtils;
import com.oyrain.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-11-30 21:43:26
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

