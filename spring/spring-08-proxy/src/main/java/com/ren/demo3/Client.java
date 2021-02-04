package com.ren.demo3;

public class Client {
    public static void main(String[] args) {
        Rent landlord = new Landlord();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(landlord);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
