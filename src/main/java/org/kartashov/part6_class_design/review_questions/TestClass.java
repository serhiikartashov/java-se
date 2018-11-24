package org.kartashov.part6_class_design.review_questions;

/**
 * Created by Serhii K. on 11/4/2015.
 */
public class TestClass {

    static int si = 10;

    public static void main(String args[]) {new TestClass();}

    public TestClass() {
        System.out.println(this);}

    public String toString() {return "TestClass.si = " + this.si;}
}
