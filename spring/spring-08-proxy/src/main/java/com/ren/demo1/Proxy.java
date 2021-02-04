package com.ren.demo1;

public class Proxy implements Rent {

    private Landlord landlord;

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    public void rent() {
        landlord.rent();
        seeHouse();
        signContract();
        collectFee();
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
}
