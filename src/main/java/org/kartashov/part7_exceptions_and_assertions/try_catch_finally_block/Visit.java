package org.kartashov.part7_exceptions_and_assertions.try_catch_finally_block;

/**
 * Created by Serhii K. on 11/4/2015.
 */
class AnimalsOutForAWalk extends RuntimeException {
}

class ExhibitClosed extends RuntimeException {
}

class ExhibitClosedForLunch extends ExhibitClosed {
}


public class Visit {

    public void visitMonkeys() {
        try {
            //seeAnimal();
        } catch (ExhibitClosedForLunch e) {// subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// superclass exception
            System.out.print("not today");
        }
    }

    public void visitSnakes() {
        /*try {
            //seeAnimal();
        } catch (RuntimeException e) {
            System.out.print("runtime exception");
        } catch (ExhibitClosed e) {// DOES NOT COMPILE
            System.out.print("not today");
        } catch (Exception e) {
            System.out.print("exception");
        }*/
    }

/*    public void doer() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new Exception();
        }
    }*/


    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before ";
                v.length();
                result += "after ";
            } catch (NullPointerException e) {
                result += "catch ";
                throw new RuntimeException();
            } finally {
                result += "finally ";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done ";
        }
        return result;
    }

    public void tryFinally(){
        try{

        }
        finally {

        }
    }

    public static void main(String[] args) {
        System.out.println(new Visit().exceptions());
    }
}
