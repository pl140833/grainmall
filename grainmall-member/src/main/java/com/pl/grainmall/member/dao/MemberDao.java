package com.pl.grainmall.member.dao;

import com.pl.grainmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 20:55:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
