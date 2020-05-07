package com.qc.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qc.common.utils.PageUtils;
import com.qc.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:45:54
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

