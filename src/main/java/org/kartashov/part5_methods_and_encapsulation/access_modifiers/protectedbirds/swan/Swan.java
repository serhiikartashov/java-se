package org.kartashov.part5_methods_and_encapsulation.access_modifiers.protectedbirds.swan;


import org.kartashov.part5_methods_and_encapsulation.access_modifiers.protectedbirds.bird.Bird;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Swan extends Bird {

    public void swim(){
        floatInWater();
        System.out.println(text);
    }
    public void helpOtherSwanSwim(){
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherBirdSwim(){
        Bird other = new Bird();
        //Bird other = new Goose();
        //other.floatInWater();             // DOES NOT COMPILE
        //System.out.println(other.text);   // DOES NOT COMPILE
    }
}
