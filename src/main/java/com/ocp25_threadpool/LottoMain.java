
package com.ocp25_threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LottoMain {
    public static void main(String[] args) throws Exception{
        // ExecutorService exec = Executors.newCachedThreadPool();
        ExecutorService exec = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
             exec.submit(new Lotto());
            System.out.println("執行續使用量: " + Thread.activeCount());
        }
       exec.shutdown();
    }
}
