package com.opc2;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        atm_loop: //迴圈名
        do {
            // menu
            System.out.println("--------------");
            System.out.println("1: 建立新帳戶");
            System.out.println("2: 存款");
            System.out.println("3: 提款");
            System.out.println("4: 查詢餘額");
            System.out.println("5: 轉帳");
            System.out.println("9: 離開");
            System.out.println("--------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("請選擇(1~9): ");
            //----------------------------------------
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    System.out.println("建立新帳戶");
                    break;
                case 2:
                    System.out.println("存款");
                    break;
                case 3:
                    System.out.println("提款");
                    break;
                case 4:
                    System.out.println("查詢");
                    break;
                case 9:
                    System.out.println("離開");
                    break atm_loop;

            }

        } while (true);
    }

}
