package com.ocp4;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int[] ans = RandomNumber.getRandomNumber(4);

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入四位數: ");
            String input = sc.next(); 
            int[] guess = {input.charAt(0) - 48, input.charAt(1) - 48, input.charAt(2) - 48, input.charAt(3) - 48};
            System.out.println(Arrays.toString(guess)); // 變成[1, 2, 3, 4]
            // 先比 B (數字相同)
            int b = 0;
            for (int i = 0; i < guess.length; i++) {
                for (int j = 0; j < ans.length; j++) {
                    if (guess[i] == ans[j]) {
                        b++;
                    }
                }
            }
            // 在比 A (位置相同數字相同) 
            int a = 0;
            for (int i = 0; i < guess.length; i++) {
                if (guess[i] == ans[i]) {
                    a++;
                }
            }
            b = b - a;
            System.out.printf("%s : %dA %dB\n", Arrays.toString(guess), a, b);
            if (a == 4) {
                System.out.println("恭喜答對了!!");
                break;
            }
        } while (true);
        System.out.println(Arrays.toString(ans));
    }
}
