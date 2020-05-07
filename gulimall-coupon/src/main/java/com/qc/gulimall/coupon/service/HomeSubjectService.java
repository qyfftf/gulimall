package com.qc.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qc.common.utils.PageUtils;
import com.qc.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 
 *
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:25:13
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

