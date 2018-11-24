package org.kartashov.part3_core_java_api.arrays;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class ArrayType {

    String names[]; // default value is NULL

    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias));     // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
        System.out.println(java.util.Arrays.toString(bugs));

        // [L - means it is an array
        // java.lang.String - reference type
        // 160bc7c0 - hash code
    }
}
