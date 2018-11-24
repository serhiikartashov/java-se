package org.kartashov.part5_methods_and_encapsulation.encapsulating;

/**
 * Created by Serhii K. on 10/20/2015.
 */
public class ImmutableSwan {

    private int numberEggs;

    // Immutable classes are allowed to have values.
    // They just can't change after instantiation.
    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    public int getNumberEggs() {
        return numberEggs;
    }
}
