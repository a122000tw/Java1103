
package com.ocp8;

public class Car extends Transportation{

    public Car() {
    }
    
    public Car(String name, int amout, int km, int price) {
        setName(name);
        setAmount(amout);
        setKm(km);
        setPrice(price);
    }
    
    public void paly() {
        System.out.println("我可以撸...");
    }
    
}
