
package com.ocp4;

import java.util.Random;

public class RandomNumber {
    public static int[] getRandomNumber(int amount) {
        Random r = new Random();
        int[] nums = new int[4];
        for (int i = 0; i < nums.length;) {
            int n = r.nextInt(9) + 1; // 隨機取1~9
            if (!isExsit(nums, n)) {  // n值是否存在於nums陣列中?
                nums[i] = n;
                i++;
            }
        }
        return nums;
    }    
    
    public static boolean isExsit(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                return true;
            }
        }
        return false;
    }
}
