package com.pl.grainmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pl.common.utils.PageUtils;
import com.pl.grainmall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 20:58:02
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

