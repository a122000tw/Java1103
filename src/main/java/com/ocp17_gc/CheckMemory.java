
package com.ocp17_gc;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

public class CheckMemory {
    public static void main(String[] args) {
        System.out.printf("%,d bytes\n", Runtime.getRuntime().freeMemory());
        Faker faker = new Faker();
        List<String> names = new ArrayList<>();
        for(int i = 0 ; i < 100 ; i++ ) {
            names.add(faker.name().lastName());
        }
        System.out.printf("%,d bytes\n", Runtime.getRuntime().freeMemory());
        faker = null;
        names = null; // 空間仍然有物件，只是未有項目指向此物件
        System.gc(); // 建議系統執行 GC
        System.out.printf("%,d bytes\n", Runtime.getRuntime().freeMemory());
    }
}
