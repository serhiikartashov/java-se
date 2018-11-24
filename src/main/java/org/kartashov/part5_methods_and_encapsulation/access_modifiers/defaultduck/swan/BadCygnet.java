package org.kartashov.part5_methods_and_encapsulation.access_modifiers.defaultduck.swan;


import org.kartashov.part5_methods_and_encapsulation.access_modifiers.defaultduck.MotherDuck;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class BadCygnet {

    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        //duck.quack();
        //System.out.println(duck.quack());
    }
}
