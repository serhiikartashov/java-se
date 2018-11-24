package org.kartashov.part1_building_blocks.creating_objects;

/**
 * Created by Serhii K. on 29.09.2015.
 */
public class Swan {

    int numberEggs; //instance variable

    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.numberEggs = 1;  // set variable
        System.out.println(swan.numberEggs); // read variables
    }


}
