package com.oyrain.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oyrain.common.utils.PageUtils;
import com.oyrain.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-12-01 20:59:41
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

