
package practice.day2;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] lens = {100, 90, 80}; //長度
        int[] wids = new int[] {30, 20, 10};
        for (int i = 0; i < lens.length; i++) {
            System.out.println(lens[i] + " ");
        }
        for (int i = 0; i < wids.length; i++) {
            System.out.println(wids[i] + " ");
        }
        System.out.println("\n---------------------");
        // 求面積
        for (int i = 0; i < lens.length; i++) {
            int area = lens[i] * wids[i];
            System.out.println(area + " ");
        }
       }
}
