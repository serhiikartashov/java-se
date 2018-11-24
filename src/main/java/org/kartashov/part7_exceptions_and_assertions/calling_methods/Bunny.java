package org.kartashov.part7_exceptions_and_assertions.calling_methods;


/**
 * Created by Serhii K. on 11/4/2015.
 */
class CanNotHopException extends Exception {
}

class TiredException extends RuntimeException {}

class Hopper {
    public void hop1() {
    }

    public void hop2() throws CanNotHopException {
    }

    public void hop3() throws Exception {
    }

    public void hop4() {
    }

    public void hop5() throws CanNotHopException {
    }

    public void hop6() throws Exception {
    }

    public void hop7() {
    }
}

public class Bunny extends Hopper {

    //public void hop1() throws CanNotHopException { } // DOES NOT COMPILE

    public void hop2() {
    }

    public void hop3() throws CanNotHopException {
    }

    //  Methods are free to throw any runtime exceptions
    //  they want without mentioning them in the method declaration.
    public void hop4() throws IllegalStateException {
    }

    /*public void hop5() throws Exception { } // DOES NOT COMPILE */

    public void hop6() throws TiredException { }

    //public abstract void hop7();

    public static void main(String[] args) {
        Hopper h = new Hopper();
        //h.hop2();
        Bunny b = new Bunny();
        b.hop2();

        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }


}
