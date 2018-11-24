package org.kartashov.part5_methods_and_encapsulation.overloading;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Overload {

    public void fly(int numMiles) {
        System.out.println("int");
    }

    public void fly(short numFeet) {
        System.out.println("short");
    }

    public boolean fly() {
        return false;
    }

    void fly(int numMiles, short numFeet) {
    }

    public void fly(short numFeet, int numMiles) throws Exception {
    }

    /*public int fly(int numMiles) {
        return 1;
    }*/     // DOES NOT COMPILE

    public static void main(String[] args) {
        new Overload().fly(1);
        new Overload().fly((short)1);
    }

    // botch methods has the same parameters list
    //public void fly(int[] lengths) { }
    //public void fly(int... lengths) { }     // DOES NOT COMPILE

}
