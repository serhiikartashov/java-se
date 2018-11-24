package org.kartashov.part6_class_design.interface_impl.staticmethod;

/**
 * Created by Serhii K. on 10/27/2015.
 */
public interface Hop {
    static int getJumpHeight() {
        return 8;
    }
}

class Bunny implements Hop {
    public void printDetails1() {
        //System.out.println(getJumpHeight()); // DOES NOT COMPILE
    }

    public void printDetails2() {
        System.out.println(Hop.getJumpHeight()); // DOES NOT COMPILE
    }
}