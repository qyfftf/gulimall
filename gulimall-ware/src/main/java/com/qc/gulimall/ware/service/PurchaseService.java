package com.qc.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qc.common.utils.PageUtils;
import com.qc.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:45:54
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

