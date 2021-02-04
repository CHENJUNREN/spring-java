package com.ren.demo1;

public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        Proxy proxy = new Proxy(landlord);
        proxy.rent();
    }
}
