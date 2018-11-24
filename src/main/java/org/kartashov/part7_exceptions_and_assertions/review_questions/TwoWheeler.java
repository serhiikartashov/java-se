package org.kartashov.part7_exceptions_and_assertions.review_questions;

/**
 * Created by Serhii K. on 11/10/2015.
 */
interface Automobile { String describe(); }

class FourWheeler implements Automobile{
    String name;
    public String describe(){ return " 4 Wheeler " + name; }
}

class TwoWheeler extends FourWheeler{
    String name;
    public String describe(){ return " 2 Wheeler " + name; }
}
