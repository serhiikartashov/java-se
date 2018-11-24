package org.kartashov.part6_class_design.inheritance;

/**
 * Created by Serhii K. on 10/23/2015.
 */
public class Zebra extends Animal {

    public Zebra(int age) {
        super(age);
    }
    public Zebra(){
        this(4);
    }
}
