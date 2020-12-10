package com.ocp11.case7_equals;

public class Ball {

    private int price;
    private String color;

    @Override
    public String toString() {
        return "Ball{" + "price=" + price + ", color=" + color + '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ball(int price, String color) {
        this.price = price;
        this.color = color;
    }

    // 複寫equals 方法
    @Override
    public boolean equals(Object obj) {
        Ball b = (Ball) obj;
        if ((b.price == price) && b.color.equals(color)) {
            return true;
        }
        return false;

    }

}
