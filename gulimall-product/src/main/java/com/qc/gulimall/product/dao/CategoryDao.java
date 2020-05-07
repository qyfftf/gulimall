package com.qc.gulimall.product.dao;

import com.qc.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 11:15:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
