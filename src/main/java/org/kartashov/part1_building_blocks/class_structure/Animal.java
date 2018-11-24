package org.kartashov.part1_building_blocks.class_structure;

/**
 * Created by Serhii K. on 29.09.2015.
 */
public class Animal {

    // comment until end of line
    String name;

    /* Multiple
    * line comment
    */

    public String getName() {
        return name;
    }

    /**
     * Javadoc multiple-line comment
     * @param name
     * @author Serhii K.
     */
    public void setName(String name) {
        this.name = name;
    }

    public int numberVisitors(int month){
        return 0;
    }

    // /* dog */

    /*
    /*ferret*/
      // */ BE careful!
}
