package com.ocp23_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class ReturnHome {

    public static void main(String[] args) {
        int n = 3;
        Runnable lunch = () -> System.out.println("吃午餐~~");

        CyclicBarrier cb = new CyclicBarrier(n, lunch);
        for (int i = 1; i <= 4; i++) {
            Thread t = new Thread(new Car(cb), (i + "號車"));
            t.start();

        }

    }
}
