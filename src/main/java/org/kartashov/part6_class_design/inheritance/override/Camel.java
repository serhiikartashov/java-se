package org.kartashov.part6_class_design.inheritance.override;

/**
 * Created by Serhii K. on 10/26/2015.
 */
public class Camel {
    protected String getNumberOfHumps() {
        return "Undefined";
    }
}

class BactrianCamel extends Camel {
    /*private int getNumberOfHumps() {  // DOES NOT COMPILE
        return 2;
    }*/
}