package com.qc.gulimall.order.dao;

import com.qc.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:36:35
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
