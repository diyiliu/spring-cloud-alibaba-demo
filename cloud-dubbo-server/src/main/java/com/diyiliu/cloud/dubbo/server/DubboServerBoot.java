package com.diyiliu.cloud.dubbo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description: DubboServerBoot
 * Author: DIYILIU
 * Update: 2020-07-03 10:12
 */

@EnableDiscoveryClient
@SpringBootApplication
public class DubboServerBoot {

    public static void main(String[] args) {

        SpringApplication.run(DubboServerBoot.class, args);
    }
}
