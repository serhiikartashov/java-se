package org.kartashov.part6_class_design.polymorphism;

/**
 * Created by Serhii K. on 10/27/2015.
 */
class Bird{}

public class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
        // Bird bird = (Bird)fish; // DOES NOT COMPILE
    }
}
