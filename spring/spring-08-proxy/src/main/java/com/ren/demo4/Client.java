package com.ren.demo4;

import com.ren.demo2.UserService;
import com.ren.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        UserServiceDynamicProxy usdp = new UserServiceDynamicProxy(new UserServiceImpl());
        UserService proxy = (UserService) usdp.getProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
