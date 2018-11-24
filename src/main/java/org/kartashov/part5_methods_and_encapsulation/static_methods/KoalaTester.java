package org.kartashov.part5_methods_and_encapsulation.static_methods;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]);      // call static method

        Koala k = new Koala();
        System.out.println(k.count);          // k is a Koala
        k = null;
        System.out.println(k.count);          // k is still a Koala
    }
}
