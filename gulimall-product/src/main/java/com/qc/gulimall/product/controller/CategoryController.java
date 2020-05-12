package com.qc.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qc.gulimall.product.entity.CategoryEntity;
import com.qc.gulimall.product.service.CategoryService;
import com.qc.common.utils.PageUtils;
import com.qc.common.utils.R;



/**
 * 商品三级分类
 *
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 11:15:38
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list/tree")
    //@RequiresPermissions("product:category:list")
    public R list(){
        List<CategoryEntity> list = categoryService.listTree();

        return R.ok().put("page", list);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){
		categoryService.delByIds(catIds);
        return R.ok();
    }

}
