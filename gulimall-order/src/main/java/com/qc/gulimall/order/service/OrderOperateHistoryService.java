package com.qc.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qc.common.utils.PageUtils;
import com.qc.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:36:35
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

