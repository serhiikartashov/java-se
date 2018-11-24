package org.kartashov.part7_exceptions_and_assertions.review_questions;

import java.io.IOException;

/**
 * Created by Serhii K. on 11/4/2015.
 */
public class DoSomething {

    public void go() {
        System.out.print("A");
        try {
            stop();
        } catch (ArithmeticException e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public void stop() {
        System.out.print("E");
        Object x = null;
        x.toString();
        System.out.print("F");
    }

/*    public static void main(String[] args) {
        new DoSomething().go();
        //new DoSomething().foo();
    }*/

    public static void main(String[] args) {
        /*System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
            // throw new RuntimeException("1");
        } catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
        } finally {
            System.out.print("e");
            throw new RuntimeException("3");
        }*/


        Float f1 = Float.valueOf(Float.NaN);
        Float f2 = Float.valueOf(Float.NaN);
        System.out.println( ""+ (f1 == f2)+" "+f1.equals(f2)+ " "+(Float.NaN == Float.NaN) );

        Float f3 = Float.valueOf(Float.POSITIVE_INFINITY);
        Float f4 = Float.valueOf(Float.POSITIVE_INFINITY);
        System.out.println( ""+ (f3 == f4)+" "+f3.equals(f4)+ " "+(Float.POSITIVE_INFINITY == Float.POSITIVE_INFINITY) );

        Float f5 = Float.valueOf(Float.NEGATIVE_INFINITY);
        Float f6 = Float.valueOf(Float.NEGATIVE_INFINITY);
        System.out.println( ""+ (f5 == f6)+" "+f5.equals(f6)+ " "+(Float.NEGATIVE_INFINITY == Float.NEGATIVE_INFINITY) );

        Float f7 = Float.valueOf(Float.MAX_VALUE);
        System.out.println(f7);
        f7+=100;
        System.out.println(f7);
        Float f90 = Float.valueOf(Float.MAX_VALUE +100);
        System.out.println(f90);
        Float f91 = f7+=100;
        System.out.println(f91);
        Float f8 = Float.valueOf(Float.MIN_VALUE);
    }

/*    public int foo() {
        int a = 0;
        int b = 0;
        try {
            return a / b;
        } catch (RuntimeException e) {
            return -1;
        } catch (ArithmeticException e) { // HAS ALREADY CAUGHT
            return 0;
        } finally {
            System.out.print("done");
        }
    }*/

    public void ohNo() throws IOException {   // INSERT CODE HERE
        System.out.println("it's ok");
        // throw new Exception(); // DOES NOT COMPILE
        // throw new IllegalArgumentException(); // POSSIBLE
        // throw new java.io.IOException(); // POSSIBLE
        // throw new RuntimeException(); // POSSIBLE
    }

    public void foo2() {
        try {
            System.out.println("work real hard");
            //
            //
        } catch (RuntimeException e) {
        } catch (StackOverflowError e) {
        }
    }

    // Error:(109, 13) java: as of release 9, '_' is a keyword, and may not be used as an identifier
//    short $_$()[] {{{
//        int _ = 0;
//        return new short[007];
//    }}}
}
