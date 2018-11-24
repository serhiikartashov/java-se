package org.kartashov.part6_class_design.inheritance;

/**
 * Created by Serhii K. on 10/26/2015.
 */
public class Wolf extends Canine {
    public double getAverageWeight() {
        // return getAverageWeight() + 20; // INFINITE LOOP
        // java.lang.StackOverflowError
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}

class Canine {
    public double getAverageWeight() {
        return 50;
    }
}
