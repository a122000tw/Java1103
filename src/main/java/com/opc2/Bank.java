
package com.opc2;

public class Bank {
    public static void main(String[] args) {
        Account ac1 = new Account();
        Account ac2 = new Account();
        ac1.name = "John";
        ac1.setBalance(10000);
        ac1.setBalance(6000);
        ac2.name = "Mary";
        ac2.setBalance(10000);
        ac1.setBalance(1000);
        //System.out.printf("name: %s, balance: %,d\n", ac1.name, ac1.balance);
        //System.out.printf("name: %s, balance: %,d\n", ac2.name, ac2.balance);
        ac1.printBalance();
        ac2.printBalance();
    }
}
