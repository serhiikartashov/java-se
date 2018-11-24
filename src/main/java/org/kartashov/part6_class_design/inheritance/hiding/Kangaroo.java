package org.kartashov.part6_class_design.inheritance.hiding;

/**
 * Created by Serhii K. on 10/26/2015.
 */
class Marsupial {
    // hidden
    public static boolean isBiped() {
        return false;
    }

    // overriden
    /*public boolean isBiped() {
        return false;
    }*/

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}

public class Kangaroo extends Marsupial {
    // hidden
    public static boolean isBiped() {
        return true;
    }

    // overriden
    /*public boolean isBiped() {
        return true;
    }*/

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}