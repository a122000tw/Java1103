
package com.ocp5;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        s1 = s1.intern(); // 將字串移入到String pool中 -1
        s1 = s2; // 改變s1的指向位置 -2
        System.out.println(s1 == s2);
        
    }
}
