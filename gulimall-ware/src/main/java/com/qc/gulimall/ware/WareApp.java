package com.qc.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qc
 * @create 2020-04-20 17:21
 */
@SpringBootApplication
@MapperScan("com.qc.gulimall.ware.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class WareApp {
    public static void main(String[] args) {
        SpringApplication.run(WareApp.class,args);
    }
}
