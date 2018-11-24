package org.kartashov.part6_class_design.review_questions;

/**
 * Created by Serhii K. on 10/27/2015.
 */

public abstract class Bird {

    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird bird = new Pelican();
        bird.fly();
    }

}

class Pelican extends Bird {

    protected void fly() {
        System.out.println("Pelican is flying");
    }

}