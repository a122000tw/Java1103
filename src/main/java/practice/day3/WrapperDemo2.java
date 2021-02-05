
package practice.day3;

public class WrapperDemo2 {
    public static void main(String[] args) {
        int a = 200;
        // Integer b = Integer.valueOf("100"); // Java5之前
        Integer b = 100;
        b = 200;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
    }
}
