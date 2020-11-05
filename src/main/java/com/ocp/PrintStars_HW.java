package com.ocp;

public class PrintStars_HW {

    public static void main(String[] args) {
        int line = 7;
        for (int k = 6; k >= 0; k--) {
            for (int m = 1; m >= 0; m--) {

                System.out.print("5");
            }

        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

