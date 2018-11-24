package org.kartashov.part5_methods_and_encapsulation.creating_constructors;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Hamster {

    private String color;
    private int weight;
    public Hamster(int weight){
        //this(weight, "brown");
        this.weight = weight;
        color = "brown";
        //this(weight, "brown");     // DOES NOT COMPILE
    }

    public Hamster(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
}
