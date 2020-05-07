package com.qc.gulimall.memember.feign;

import com.qc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qc
 * @create 2020-04-28 14:59
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/memember/list")
    R memembercoupon();
}
