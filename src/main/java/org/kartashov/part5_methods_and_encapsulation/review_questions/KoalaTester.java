package org.kartashov.part5_methods_and_encapsulation.review_questions;

/**
 * Created by Serhii K. on 10/26/2015.
 */
public class KoalaTester {

    public static void main(String[] args) {
        Koala k = new Koala();
        System.out.println(k.count);          // k is a Koala
        k = null;
        System.out.println(k.count);
        k.main(new String[]{"1"});
    }
}

class Koala {
    public static int count = 0;               // static variable
    public static void main(String[] args) {      // static method
        System.out.println(count);
    }
}