package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author YunXueJian
 * @Date 2022/11/21 20:19
 * @email yunxuejian@htdf.cc
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }

}
