
package com.pattern.observer;

public class User implements Observer{
    private  String name;
    
    public User(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String data) {
        System.out.printf("%s 收到資料: %s\n", name, data);
    }
    
}
