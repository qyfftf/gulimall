package com.qc.gulimall.memember.controller;

import java.util.Arrays;
import java.util.Map;

import com.qc.gulimall.memember.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qc.gulimall.memember.entity.MemberEntity;
import com.qc.gulimall.memember.service.MemberService;
import com.qc.common.utils.PageUtils;
import com.qc.common.utils.R;



/**
 * 会员
 *
 * @author qc
 * @email sunlightcs@gmail.com
 * @date 2020-04-26 14:31:29
 */
@RestController
@RequestMapping("memember")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private CouponFeignService couponFeignService;
    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("memember:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);
        return R.ok().put("page", page);
    }
    @GetMapping("/testr")
    public R test(){
        R memembercoupon = couponFeignService.memembercoupon();
        return memembercoupon;
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("memember:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("memember:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("memember:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("memember:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
