package org.kartashov.part5_methods_and_encapsulation.access_modifiers.protectedbirds.goose;


import org.kartashov.part5_methods_and_encapsulation.access_modifiers.protectedbirds.bird.Bird;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Gosling extends Bird {
    public void swim(){
        floatInWater();
        System.out.println(text);
    }
}
