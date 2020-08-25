package com.zhenglei.dubbo.impl;

import com.zhenglei.dubbo.MyProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component("demoServiceComponent")
public class MyProviderServiceImpl implements MyProviderService {
    @DubboReference
    private MyProviderService myProviderService;

    public String sayHello(String name) {
        return myProviderService.sayHello("123");
    }
}
