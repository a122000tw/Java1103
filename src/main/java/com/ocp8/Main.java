package com.ocp8;

import java.util.Arrays;

public class Main {

    // 主程式
    public static void main(String[] args) {
        // 開公司
        RentalCompany rc = new RentalCompany();
        // 查看庫存
        Transportation[] trans = rc.getTransportations();
        System.out.println(Arrays.toString(trans));
        // 租一台車,三台腳踏車,兩台飛機
        int subtotal = 0;
        for (Transportation ts : trans) {
            if (ts instanceof Car) {
                ((Car) ts).paly();
                //Car car = (Car) ts; // ts轉型car
                //car.paly();
                System.out.printf("我要租: %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 1;
                ts.setAmount(amount);
                subtotal += 1 * ts.getPrice();
            }
            if (ts instanceof Bicycle) {
                ((Bicycle) ts).message();
                System.out.printf("我要租: %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 3;
                ts.setAmount(amount);
                subtotal += 3 * ts.getPrice();
            }
            if (ts instanceof Airplane) {
                ((Airplane) ts).service();
                System.out.printf("我要租: %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 2;
                ts.setAmount(amount);
                subtotal += 2 * ts.getPrice();
            }

        }

        // 更新後的庫存資料
        System.out.println("更新後庫存:" + Arrays.toString(trans));
        // 試問總租金是多少
        System.out.printf("總租金: $%,d\n", subtotal);
    }

}
