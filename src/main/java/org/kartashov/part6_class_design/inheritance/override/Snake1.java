package org.kartashov.part6_class_design.inheritance.override;

/**
 * Created by Serhii K. on 10/26/2015.
 */
class InsufficientDataException1 extends Exception {
}

class Reptile1 {
    protected boolean hasLegs() throws InsufficientDataException1 {
        throw new InsufficientDataException1();
    }

    protected double getWeight() throws Exception {
        return 2;
    }
}

public class Snake1 extends Reptile1 {
    protected boolean hasLegs() {
        return false;
    }

    protected double getWeight() throws InsufficientDataException1 {
        return 2;
    }

}
