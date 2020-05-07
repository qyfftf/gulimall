package com.qc.gulimall.memember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qc.common.utils.PageUtils;
import com.qc.gulimall.memember.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:31:29
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

