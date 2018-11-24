package org.kartashov.part7_exceptions_and_assertions.calling_methods;

/**
 * Created by Serhii K. on 11/4/2015.
 */
class NoMoreCarrotsException extends Exception {
}

public class Declared {

    private static void eatCarrot() throws NoMoreCarrotsException {
    }

    public static void main1(String[] args) throws NoMoreCarrotsException {// declare exception
        eatCarrot();
    }

    public static void main2(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {// handle exception
            System.out.print("sad rabbit");
        }
    }

    public void bad() {
/*        try {
            eatCarrot1();
        } catch (NoMoreCarrotsException e) {// DOES NOT COMPILE
            System.out.print("sad rabbit");
        }*/
    }

    public void good() throws NoMoreCarrotsException {
        eatCarrot1();
    }

    private static void eatCarrot1() {
    }

}
