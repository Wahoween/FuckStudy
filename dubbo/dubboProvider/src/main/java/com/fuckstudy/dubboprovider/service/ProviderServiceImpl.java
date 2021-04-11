package com.fuckstudy.dubboprovider.service;

import com.fuckstudy.service.ProviderService;


public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String word) throws Exception {
//        System.out.println("休息十秒钟"+System.currentTimeMillis());
//        Thread.sleep(10000);
//        System.out.println("休息好了"+System.currentTimeMillis());
        return word+"niubi";
    }
}
