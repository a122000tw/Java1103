
package com.ocp33_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {
    public static void main(String[] args) {
        // 路徑結合 resolve()
        Path p1 = Paths.get("C:/aaa/bbb/ccc");
        Path p2 = Paths.get("ddd/salary.txt");
        Path p3 = Paths.get("C:/aaa/bbb/ccc");
        Path p4 = Paths.get("/ddd/salary.txt"); // 絕對路徑
        p1 = p1.resolve(p2);
        p3 = p3.resolve(p4);
        System.out.println(p1);
        System.out.println(p3);
    }
}
