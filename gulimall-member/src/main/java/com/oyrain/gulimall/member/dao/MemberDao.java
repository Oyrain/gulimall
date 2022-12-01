package com.oyrain.gulimall.member.dao;

import com.oyrain.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author oyrain
 * @email oyrain98@gmail.com
 * @date 2022-12-01 20:59:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
