package org.kartashov.part5_methods_and_encapsulation.static_methods;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Static {
    private String name = "Static class";

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }

    public static void main(String args[]) {
        first();
        second();
        //third();          // DOES NOT COMPILE
        //name;            // DOES NOT COMPILE
    }
}
