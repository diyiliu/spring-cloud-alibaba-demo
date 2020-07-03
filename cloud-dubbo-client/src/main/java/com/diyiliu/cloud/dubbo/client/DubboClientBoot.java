package com.diyiliu.cloud.dubbo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description: DubboClientBoot
 * Author: DIYILIU
 * Update: 2020-07-03 10:45
 */

@EnableDiscoveryClient
@SpringBootApplication
public class DubboClientBoot {

    public static void main(String[] args) {

        SpringApplication.run(DubboClientBoot.class, args);
    }
}
