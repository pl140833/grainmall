package com.pl.grainmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pl.common.utils.PageUtils;
import com.pl.grainmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 20:55:42
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

