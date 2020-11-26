package com.ocp8;

public class Bicycle extends Transportation {

    public Bicycle() {
    }

    public Bicycle(String name, int amout, int km, int price) {
        setName(name);
        setAmount(amout);
        setKm(km);
        setPrice(price);
    }

    public void message() {
        System.out.println("早上9點可以騎到晚上9點");
    }

}
