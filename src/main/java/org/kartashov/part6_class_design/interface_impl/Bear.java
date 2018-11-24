package org.kartashov.part6_class_design.interface_impl;

/**
 * Created by Serhii K. on 10/27/2015.
 */
interface Herbivore {
    public void eatPlants();
}

interface Omnivore {
    public void eatPlants();

    public void eatMeat();
}

public class Bear implements Herbivore, Omnivore {

    public void eatMeat() {
        System.out.println("Eating meat");
    }

    // creating a class that implements one of the two methods
    // automatically implements the second method.
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
