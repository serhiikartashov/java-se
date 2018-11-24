package org.kartashov.part6_class_design.polymorphism;

/**
 * Created by Serhii K. on 10/27/2015.
 */
class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());

        Primate primate2 = lemur;
        //Lemur lemur2 = primate2; // DOES NOT COMPILE
        Lemur lemur3 = (Lemur) primate2;
        System.out.println(lemur3.age);

    }
}