package org.kartashov.part6_class_design.inheritance;

/**
 * Created by Serhii K. on 10/26/2015.
 */
class InsufficientDataException2 extends Exception {}

class Reptile2 {
    protected double getHeight() throws InsufficientDataException2 {
        return 2;
    }

    protected int getLength() {
        return 10;
    }
}

public class Snake2 extends Reptile2 {
    //  Since Exception is not a subclass of InsufficientDataException
    /*protected double getHeight() throws Exception {  // DOES NOT COMPILE
        return 2;
    }*/

    // The child class defines a new exception that the parent class did not
    /*protected int getLength() throws InsufficientDataException2 { // DOES NOT COMPILE
        return 10;
    }*/
}