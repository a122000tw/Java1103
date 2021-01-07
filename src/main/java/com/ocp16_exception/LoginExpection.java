
package com.ocp16_exception;

public class LoginExpection extends Exception{
    
    public LoginExpection(String string) {
        // 將錯誤訊息傳給父類別
        super();
    }
    
    
    // 自訂一個新方法
    public void 怎麼辦() {
        System.out.println("請重新登入");
    }
    
}
