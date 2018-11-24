package org.kartashov.part6_class_design.inheritance.finalll;

/**
 * Created by Serhii K. on 10/26/2015.
 */
class Bird {
    public final boolean hasFeathers() {
        return true;
    }
}

public class Penguin extends Bird {
    /*public final boolean hasFeathers() { // DOES NOT COMPILE
        return false;
    }*/
}
