package com.zhenglei.dubbo.service;

import com.zhenglei.dubbo.MyProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    //stub 注解方式 配置本地存根
    @DubboReference(stub = "com.zhenglei.dubbo.sub.MyProviderServiceSub")
    private MyProviderService myProviderService;

    public String sayHello(String name){
        return myProviderService.sayHello(name);
    }
}
