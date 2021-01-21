
package com.ocp25_threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JobMain {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        exec.submit(new ShortJob());
        exec.submit(new Job());
        exec.submit(new ShortJob());
        exec.submit(new LongJob());
        exec.submit(new ShortJob());
        exec.shutdown();
        System.out.println("shutdown...");
        // 監測執行續的執行狀況
        while (!exec.awaitTermination(1, TimeUnit.SECONDS)) {            
            System.out.println("還有執行續在執行任務..." + Thread.activeCount());
        }
        System.out.println("close...所有工作都已經執行完畢");
        
    }
}
