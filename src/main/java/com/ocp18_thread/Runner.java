package com.ocp18_thread;

public class Runner extends Thread{ // 變成執行續物件
    
    // 執行續的程式進入點
    @Override
    public void run() {
        // 安排工作任務
        job();
    }

    public void job() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 3000; i++) {
            System.out.printf("%s 跑了 %d 公尺\n", name, i);
        }
    }

}
