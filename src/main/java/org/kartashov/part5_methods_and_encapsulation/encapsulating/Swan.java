package org.kartashov.part5_methods_and_encapsulation.encapsulating;

/**
 * Created by Serhii K. on 10/20/2015.
 */
public class Swan {

    private int numberEggs; // private

    public int getNumberEggs() {                    // getter
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) {     // setter
        if (numberEggs >= 0)                     // guard condition
            this.numberEggs = numberEggs;
    }
}
