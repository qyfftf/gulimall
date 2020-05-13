package com.qc.gulimall.thirdpart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qc
 * @create 2020-05-13 12:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ThirdPartApp {
    public static void main(String[] args) {
        SpringApplication.run(ThirdPartApp.class,args);
    }
}
