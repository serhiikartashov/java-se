package org.kartashov.part5_methods_and_encapsulation.access_modifiers.protectedbirds.bird;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Bird {

    protected String text = "floating";
    protected void floatInWater() {
        System.out.println(text);
    }
}
