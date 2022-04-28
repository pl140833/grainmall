package com.pl.grainmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pl.common.utils.PageUtils;
import com.pl.grainmall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 20:21:46
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

