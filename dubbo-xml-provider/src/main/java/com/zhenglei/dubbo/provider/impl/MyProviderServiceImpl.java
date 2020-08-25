package com.zhenglei.dubbo.provider.impl;

import com.zhenglei.dubbo.MyProviderService;

/**
 * 服务提供者接口实现类
 *
 * @author zhenglei
 */
public class MyProviderServiceImpl implements MyProviderService {

    public String sayHello(String name) {
        return "服务 xml ： MyProviderServiceImpl 。。 sayHello: " + name;
    }
}