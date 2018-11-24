package org.kartashov.part6_class_design.inheritance;

/**
 * Created by Serhii K. on 11/2/2015.
 */
class Super2 {
    public String toString() {
        return "4";
    }
}

public class SubClass extends Super2 {

    public String toString() {
        return super.toString() + "3";
    }

    public static void main(String[] args) {
        System.out.println(new SubClass());
    }
}
