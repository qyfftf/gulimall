package com.qc.gulimall.order.dao;

import com.qc.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:36:35
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
