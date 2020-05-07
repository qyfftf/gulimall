package com.qc.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qc
 * @create 2020-04-20 17:20
 */
@MapperScan("com.qc.gulimall.order.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class,args);
    }
}
