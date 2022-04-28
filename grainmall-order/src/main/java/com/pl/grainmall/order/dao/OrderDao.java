package com.pl.grainmall.order.dao;

import com.pl.grainmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author longzer
 * @email 2226185859@qq.com
 * @date 2022-04-26 21:20:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
