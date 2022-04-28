package com.pl.grainmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pl.common.utils.PageUtils;
import com.pl.grainmall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 20:58:02
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

