package com.pl.grainmall.order.dao;

import com.pl.grainmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 21:20:11
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
