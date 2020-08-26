package com.zhenglei.dubbo.impl;

import com.zhenglei.dubbo.MyProviderService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class MyProviderServiceImpl implements MyProviderService {
    @Override
    public String sayHello(String name) {
        return "boot dubbo :" + name;
    }
}
