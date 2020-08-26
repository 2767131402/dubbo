package com.zhenglei.dubbo.controller;

import com.zhenglei.dubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/echo")
    public String sayHello(String name){
        return testService.sayHello(name);
    }
}
