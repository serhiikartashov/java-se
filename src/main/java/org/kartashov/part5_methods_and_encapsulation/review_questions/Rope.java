package org.kartashov.part5_methods_and_encapsulation.review_questions;

/**
 * Created by Serhii K. on 10/20/2015.
 */
public class Rope {

    public static void swing() {
        System.out.print("swing ");
    }


    public void climb() {
        System.out.println("climb ");
    }


    public static void play() {
        swing();
        //climb();
    }


    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();

    }
}
