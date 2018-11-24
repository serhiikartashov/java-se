package org.kartashov.part5_methods_and_encapsulation.review_questions;

/**
 * Created by Serhii K. on 10/21/2015.
 */
public class RopeSwing {
    private static final String leftRope;
    private static final String rightRope;
    //private static final String bench; // DOES NOT COMPILE
    private static final String name = "name";

    static {
        leftRope = "left";
        rightRope = "right";
    }

    static {
        // name = "name"; // DOES NOT COMPILE
        // rightRope = "right";// DOES NOT COMPILE
    }

    public static void main(String[] args) {
        // bench = "bench"; // DOES NOT COMPILE
    }
}
