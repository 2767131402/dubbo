package com.zhenglei.dubbo;

import com.zhenglei.dubbo.impl.MyProviderServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.util.concurrent.CountDownLatch;

public class DubboApiProviderApplication {

    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");

    public static void main(String[] args) throws Exception {
        ServiceConfig<MyProviderService> service = new ServiceConfig<MyProviderService>();
        service.setApplication(new ApplicationConfig("dubbo-api-provider"));
        service.setRegistry(new RegistryConfig("zookeeper://" + zookeeperHost + ":2181"));
        service.setInterface(MyProviderService.class);
        service.setRef(new MyProviderServiceImpl());
        service.export();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}

