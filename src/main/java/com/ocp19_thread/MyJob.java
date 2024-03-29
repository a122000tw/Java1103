
package com.ocp19_thread;

public class MyJob {
    public static void main(String[] args) {
        
        Runnable r1 = new Job1();
        Runnable r2 = new Job2();
        Runnable r3 = new Job3();
        Runnable r4 = () -> System.out.println("買早餐");
        Thread t = new Thread(r4);
        t.start();
    }
}
