package com.utils;

public class MathUtil {
    // 總和
    public static double sum(double[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
//        for (int i = 0; i < values.length;sum += values[i++]);

        return sum;
    }
    // 平均
    public static double avg(double[] values) {
        return sum(values) / values.length;
    }
    // 標準差
    public static double sd(double[] values) {
        // 身高平方差的總和
        double avg = avg(values);
        double h_diff_sum = 0;
        for (int i = 0; i < values.length; i++) {
            h_diff_sum += Math.pow(values[i] - avg, 2);
        }
        System.out.printf("身高平方差的總和: %.2f\n", h_diff_sum);
        // 身高的標準差(SD)
        double sd = Math.sqrt((1.0 / values.length) * h_diff_sum);
        return sd;
    }
    // 變異係數
    public static double cv(double [] values) {
        double sd = sd(values);
        double avg = avg(values);
        double cv = sd / avg;
        return cv;
    }
}
