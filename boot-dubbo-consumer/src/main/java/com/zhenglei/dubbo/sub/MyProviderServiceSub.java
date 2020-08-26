package com.zhenglei.dubbo.sub;

import com.zhenglei.dubbo.MyProviderService;

/**
 * 创建本地存根
 * 在调用远程方法前 进行判断，判断通过才调用远程方法
 * 注：本地存根建议放到公共接口里面，这里为止不对
 */
public class MyProviderServiceSub implements MyProviderService {
    private MyProviderService myProviderService;

    public MyProviderServiceSub(MyProviderService myProviderService) {
        this.myProviderService = myProviderService;
    }

    @Override
    public String sayHello(String name) {
        return null;
    }
}
