package com.diyiliu.cloud.dubbo.server.service;

import com.diyiliu.cloud.dubbo.service.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Description: EchoServiceImpl
 * Author: DIYILIU
 * Update: 2020-07-03 10:17
 */

@Service(protocol = "dubbo")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "[echo] Hello, " + message;
    }
}
