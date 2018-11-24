package org.kartashov.part2_operators_and_statements.addition_binary_operators;

/**
 * Created by Serhii K. on 02.10.2015.
 */
public class TestClass {

    public static void main(String[] args) {
        boolean hasParams = (args == null ? false : true);
        if(hasParams){
            System.out.println("has params");
        }{
            System.out.println("no params");
        }
    }
}
