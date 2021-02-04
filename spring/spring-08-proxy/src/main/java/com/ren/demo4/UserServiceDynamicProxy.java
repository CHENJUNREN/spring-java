package com.ren.demo4;

import java.lang.reflect.Method;

public class UserServiceDynamicProxy extends DynamicProxy {

    public UserServiceDynamicProxy(Object object) {
        super(object);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return super.invoke(proxy, method, args);
    }

    public void log(String msg) {
        System.out.println("[log] --> " + msg + " method called!");
    }
}
