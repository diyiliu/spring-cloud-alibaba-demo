package com.diyiliu.cloud.dubbo.client.controller;

import com.diyiliu.cloud.dubbo.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: DubboClientController
 * Author: DIYILIU
 * Update: 2020-07-03 10:47
 */

@RestController
public class DubboClientController {

    @Reference
    private EchoService echoService;

    @GetMapping("/echo")
    public String echo(String message) {

        return echoService.echo(message);
    }
}
