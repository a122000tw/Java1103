package com.ocp9;

public class MuliAdd {

    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    // ...(省略號) 0~多個參數包含陣列
    public static void add(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add();
        add(10);
        add(10, 20);
        add(10, 10, 30);
        add(10, 10, 30, 40);
        add(10, 10, 30, 40, 50);
        add(10, 20, 30, 40, 50, 60);
        int[] nums = {10, 20, 30, 40, 50, 60, 70};
        add(nums);
    }
}
