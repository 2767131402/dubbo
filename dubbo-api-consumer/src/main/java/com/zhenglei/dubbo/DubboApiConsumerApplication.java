package com.zhenglei.dubbo;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

public class DubboApiConsumerApplication {

    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");

    public static void main(String[] args) {
        ReferenceConfig<MyProviderService> reference = new ReferenceConfig<MyProviderService>();
        reference.setApplication(new ApplicationConfig("dubbo-api-consumer"));
        reference.setRegistry(new RegistryConfig("zookeeper://" + zookeeperHost + ":2181"));
        reference.setInterface(MyProviderService.class);
        MyProviderService service = reference.get();
        String message = service.sayHello("dubbo");
        System.out.println(message);
    }

}
