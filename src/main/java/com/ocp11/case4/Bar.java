
package com.ocp11.case4;

public class Bar {
    public void hello() {
        final int x = 100; // 在Java 8之後可以不用加final
        // x++;
        class Foo {
            void printMe() {
                System.out.println("I am Foo");
                // 若要存取hello() 外部方法的區域變數
                // 則該變數必須是final
                System.out.println(x); // x有提供給內部類別使用為final 無使用則是一般變數
            }
        }
        Foo foo = new Foo();
        foo.printMe();
    }
}
