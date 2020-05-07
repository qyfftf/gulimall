package com.qc.gulimall.ware.dao;

import com.qc.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:45:54
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
