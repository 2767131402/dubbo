package com.zhenglei.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboXmlProviderApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.println("服务提供者向zookeeper中心注册服务成功 暴露的端口为：20880");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
