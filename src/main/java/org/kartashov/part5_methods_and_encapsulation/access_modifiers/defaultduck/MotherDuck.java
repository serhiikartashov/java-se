package org.kartashov.part5_methods_and_encapsulation.access_modifiers.defaultduck;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class MotherDuck {

    String noise = "quack";
    void quack(){
        System.out.println(noise);
    }

    private void makeNoise(){
        quack();
    }
}
