package com.zhenglei.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboXmlConsumerApplication {

    public static void main(String[] args) {
        //读取消费者配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        context.start();
        //获取消费实例
        MyProviderService demoProviderService=(MyProviderService) context.getBean("myProviderService");
        String result=demoProviderService.sayHello("Miya");
        System.out.println("远程调用的结果："+result);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        context.close();
    }

}
