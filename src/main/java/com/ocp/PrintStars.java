package com.ocp;

public class PrintStars {

    public static void main(String[] args) {
        int line = 7;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
