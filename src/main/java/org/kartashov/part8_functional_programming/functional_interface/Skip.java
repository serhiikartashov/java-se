package org.kartashov.part8_functional_programming.functional_interface;

/**
 * Created by Serhii K. on 2/4/2016.
 */
// FUNCTIONAL INTERFACE!
public interface Skip extends Sprint {

    default int getHopCount(Animal animal){
        return 10;
    }

    static void skip(int speed){}

}
