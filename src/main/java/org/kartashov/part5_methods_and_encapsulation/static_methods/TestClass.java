package org.kartashov.part5_methods_and_encapsulation.static_methods;

/**
 * Created by Serhii on 16.11.2015.
 */
interface MyInter {

    //void abs();

    default String myMethod(){
        return "";
    }
}



public class TestClass {
    public static void main(String[] args) {
        new MyInter() {}.myMethod();
    }
}
