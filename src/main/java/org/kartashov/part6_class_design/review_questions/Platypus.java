package org.kartashov.part6_class_design.review_questions;

/**
 * Created by Serhii K. on 10/27/2015.
 */
class Mammal {


    public Mammal(int age) {
        System.out.print("Mammal");
    }


}

public class Platypus extends Mammal {

    public Platypus() {
        super(1);
        System.out.print("Platypus");
    }


    public static void main(String[] args) {
        new Mammal(5);
    }

}
