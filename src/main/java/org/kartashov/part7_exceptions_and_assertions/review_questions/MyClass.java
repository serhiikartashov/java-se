package org.kartashov.part7_exceptions_and_assertions.review_questions;

/**
 * Created by Serhii K. on 11/10/2015.
 */
public class MyClass<A> {

    <B> MyClass(B b){

    }

    public static void main(String[] args) {
        MyClass<Integer> myObject = new MyClass<>("");
        new MyClass<Integer>("");
    }
}


