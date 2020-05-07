package com.qc.gulimall.memember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qc
 * @create 2020-04-20 17:18
 */
@MapperScan("com.qc.gulimall.memember.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.qc.gulimall.memember.feign")
public class MememberApp {
    public static void main(String[] args) {
        SpringApplication.run(MememberApp.class,args);
    }
}
