package org.kartashov.part3_core_java_api.equality;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class Tiger {
    String name;

    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        System.out.println(t1==t1); // true
        System.out.println(t1==t2); // false
        System.out.println(t1.equals(t2)); // false : Tiger does not implement equals()
    }
}
