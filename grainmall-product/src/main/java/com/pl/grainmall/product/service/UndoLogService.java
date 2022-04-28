package com.pl.grainmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pl.common.utils.PageUtils;
import com.pl.grainmall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 19:31:41
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

