package com.zhenglei.dubbo.impl;

import com.zhenglei.dubbo.MyProviderService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class MyProviderServiceImpl implements MyProviderService {

    public String sayHello(String name) {
        return "服务 annotation ： MyProviderServiceImpl 。。 sayHello: "+name;
    }
}
