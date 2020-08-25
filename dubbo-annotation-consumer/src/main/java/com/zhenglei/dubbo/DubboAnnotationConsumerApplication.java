package com.zhenglei.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class DubboAnnotationConsumerApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        MyProviderService service = context.getBean("demoServiceComponent", MyProviderService.class);
        String hello = service.sayHello("world");
        System.err.println("result :" + hello);
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.zhenglei.dubbo.impl")
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = {"com.zhenglei.dubbo.impl"})
    static class ConsumerConfiguration {

    }

}
