package com.pl.grainmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pl.common.utils.PageUtils;
import com.pl.grainmall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 21:20:11
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

