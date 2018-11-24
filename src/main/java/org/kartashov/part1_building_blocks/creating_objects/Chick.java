package org.kartashov.part1_building_blocks.creating_objects;

/**
 * Created by Serhii K. on 29.09.2015.
 */
public class Chick {
    private String name = "Fluffy";
    {
        System.out.println("setting field");
        System.out.println(name);}

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);

    }

    /*
    { System.out.println(name); }  // DOES NOT COMPILE
    private String name = "Fluffy";
    */
}
