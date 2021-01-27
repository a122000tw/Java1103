
package practice.day2;

import java.util.Arrays;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] radius = {10, 20, 30};
        // 圓面積 for-loop
        for (int i = 0; i < radius.length; i++) {
            double area = Math.pow(radius[i], 2) * Math.PI;
            System.out.printf("%.2f\n", area);
        }
        System.out.println();
        // 圓面積 for-in(each)
        for(int r : radius) {
            double area = Math.pow(r, 2) * Math.PI;
            System.out.printf("%.2f\n", area);
        }
        System.out.println();
        // Java8(stream)
        Arrays.stream(radius).forEach(r -> {
            double area = Math.pow(r, 2) * Math.PI; 
            System.out.printf("%.2f\n", area);
        });
        System.out.println();
        // Java8(stream)
        Arrays.stream(radius).forEach(r -> System.out.printf("%.2f\n", Math.pow(r, 2) * Math.PI));
    }
}
