package com.qc.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qc
 * @create 2020-04-20 17:17
 */
@MapperScan("com.qc.gulimall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class CouponApp {
    public static void main(String[] args) {
        SpringApplication.run(CouponApp.class,args);
    }
}
