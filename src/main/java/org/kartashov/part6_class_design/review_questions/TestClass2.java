package org.kartashov.part6_class_design.review_questions;

/**
 * Created by Serhii K. on 11/4/2015.
 */
class Super {
    static String ID = "QBANK";

    static {
        System.out.println("Super");
    }
}

class Sub1 extends Super {

    static {
        System.out.print("In Sub11");
    }

    static {
        System.out.print("In Sub12");
    }

    public static void foo(){
        System.out.println("Foo");
    }
}

class Sub2 extends Super {
    static String ID = "QBANK1";
    static {
        System.out.print("In Sub2");
    }
}

public class TestClass2 {
    public static void main(String[] args) {
        System.out.println(Sub1.ID);
        Sub1.foo();
        System.out.println(Sub2.ID);
    }
}
