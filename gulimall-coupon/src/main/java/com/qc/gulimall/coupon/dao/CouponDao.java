package com.qc.gulimall.coupon.dao;

import com.qc.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:25:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
