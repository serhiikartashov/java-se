package org.kartashov.part5_methods_and_encapsulation.access_modifiers.privateduck;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class BadDuckling {

    public void makeNoise(){
        FatherDuck duck = new FatherDuck();
        //duck.quack();
        //System.out.println(duck.noise);
    }
}
