
package com.ocp11.case2;

public abstract class Game {
    public int price() {
        return 99;
    }
    abstract void play();
    // 多做一個copyright方法
    public void copyright() {
        System.out.println("版權所有");
    }
    
}
