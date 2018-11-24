package org.kartashov.part6_class_design.inheritance;

/**
 * Created by Serhii K. on 10/23/2015.
 */
public class Animal {

    private int age;
    public Animal(int age){
        // Call to the parent constructor defined in java.lang.Object
        super();
        this.age = age;
        // super(); // DOES NOT COMPILE
    }
}
