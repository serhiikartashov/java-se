package org.kartashov.part7_exceptions_and_assertions.review_questions;

/**
 * Created by Serhii K. on 11/4/2015.
 */
class TestClass{
    public static void main(String[] args) throws Exception{
        try{
            amethod();
            System.out.println("try");
        }
        catch(Exception e){
            System.out.println("catch");
        }
        finally   {
            System.out.println("finally");
        }
        System.out.println("out");
    }
    public static void amethod(){ }
}