package com.zhenglei.dubbo.impl;

import com.zhenglei.dubbo.MyProviderService;

public class MyProviderServiceImpl implements MyProviderService {
    public String sayHello(String name) {
        return "服务 api ： MyProviderServiceImpl 。。 sayHello: "+name;
    }
}
