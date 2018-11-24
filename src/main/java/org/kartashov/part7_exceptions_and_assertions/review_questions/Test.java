package org.kartashov.part7_exceptions_and_assertions.review_questions;

/**
 * Created by Serhii K. on 11/4/2015.
 */
public class Test {

    public static void main(String[] args) {
        int j = 1;
        try {
            int i = doIt() / (j = 2);
        } catch (Exception e) {
            System.out.println(" j = " + j);
        }
    }

    public static int doIt() throws Exception {
        throw new Exception("FORGET IT");
    }
}
