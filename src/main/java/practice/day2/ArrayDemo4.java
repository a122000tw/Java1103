
package practice.day2;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] scores = {40, 70, 30, 90, 100};
        // 算出及格分數之平均
        // Java7
        int count = 0; //有多少人及格
        int sum = 0; // 及格的總分
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= 60) {
                count += 1;
                sum += scores[i];
            }
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);
        System.out.printf("%.1f\n" , (double)(sum/count));
        // Java8
        double avg = Arrays.stream(scores)
                .filter(s -> s >= 60)
                .average()
                .getAsDouble();
        System.out.printf("%.1f\n", avg);
    }   
}
