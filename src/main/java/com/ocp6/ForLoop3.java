
package com.ocp6;

public class ForLoop3 {
    public static void main(String[] args) {
        int[][][] nums = {
            {{100, 90}, {80, 70}, {60, 50}},
            {{70, 90}, {80, 100}, {90, 90}}
        };
        // 求所有數字的總和?
        for (int[][] num : nums) {
            for (int[] is : num) {
                for (int i : is) {
                    System.out.println(i);
                }
            }
        }
    }
}
