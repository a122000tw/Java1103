
package com.ocp6;

public class Drink {
    private String name;
    private int price;
    
    // 建構子

    public Drink() {
    }

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    // 封裝方式

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", price=" + price + '}';
    }
    
    
    
    
}
