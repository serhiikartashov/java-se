package org.kartashov.part6_class_design.review_questions;

/**
 * Created by Serhii K. on 11/4/2015.
 */

class A1{
    public static void sM1() {  System.out.println("In base static"); }
}

public class BB extends A1{
    // public static void sM1() {  System.out.println("In sub static"); }
    // public  void sM1() {  System.out.println("In sub non-static"); }
}
