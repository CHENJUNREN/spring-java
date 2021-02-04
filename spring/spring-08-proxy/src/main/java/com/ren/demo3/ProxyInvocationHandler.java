package com.ren.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        signContract();
        collectFee();
        return result;
    }

    public void seeHouse() {
        System.out.println("中介带你看房子");
    }

    public void signContract() {
        System.out.println("签合同");
    }

    public void collectFee() {
        System.out.println("收中介费");
    }

    /*private Object object;

    public ProxyInvocationHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }*/

}
