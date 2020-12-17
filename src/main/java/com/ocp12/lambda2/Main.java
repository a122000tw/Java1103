package com.ocp12.lambda2;

public class Main {

    // Java 8 
    public static void main(String[] args) {
        Add add = (x, y) -> x + y; // 加法邏輯
        Add add2 = (x, y) -> {     // 乘法邏輯
            return x * y;
        };
        System.out.println(add.sum(10, 20));
        System.out.println(add2.sum(10, 20));
        
        oneAdd(add2);
        oneAdd(add);
        oneAdd((x, y) -> x / y);
        oneAdd((x, y) -> x - y);
    }
    public static void oneAdd(Add a1) {
        System.out.println(a1.sum(10, 5));
    }
}
