package org.kartashov.part6_class_design.interface_impl;

/**
 * Created by Serhii K. on 10/27/2015.
 */
interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

// multiple inheritance is not allowed
public class Cat implements Walk, Run {  // DOES NOT COMPILE

    // subclass overrides the duplicate default methods
    // comment this method and class won't compile!
    public int getSpeed() {    return 1;  }

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
