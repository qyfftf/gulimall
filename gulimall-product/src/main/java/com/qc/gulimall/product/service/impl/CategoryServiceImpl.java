package com.qc.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qc.common.utils.PageUtils;
import com.qc.common.utils.Query;

import com.qc.gulimall.product.dao.CategoryDao;
import com.qc.gulimall.product.entity.CategoryEntity;
import com.qc.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listTree() {
        //1.查询出来全部分类数据
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2.利用java8的stream api进行组装分类的属性结构
        List<CategoryEntity> collect = categoryEntities.stream().filter(item -> {
            return item.getParentCid() == 0;
        }).map(item -> {
            item.setChileCategoryList(getChildList(item, categoryEntities));
            return item;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort())- (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }

    @Override
    public void delByIds(Long[] catIds) {
        //TODO 删除前要确认没有引用
        //逻辑删除
        baseMapper.deleteBatchIds(Arrays.asList(catIds));
    }

    private List<CategoryEntity> getChildList(CategoryEntity categoryEntity, List<CategoryEntity> categoryEntities) {
        List<CategoryEntity> collect = categoryEntities.stream().filter(item -> {
            return item.getParentCid() == categoryEntity.getCatId();
        }).map(item -> {
            item.setChileCategoryList(getChildList(item, categoryEntities));
            return item;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort())- (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }


}