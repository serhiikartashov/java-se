package org.kartashov.part5_methods_and_encapsulation.access_modifiers.privateduck;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class FatherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise);     // private access is ok
    }

    private void makeNoise() {
        quack();                    // private access is ok
    }
}
