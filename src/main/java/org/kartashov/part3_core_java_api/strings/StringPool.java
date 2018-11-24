package org.kartashov.part3_core_java_api.strings;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class StringPool {

    static String s1 = "123";
    final static String s2 = "456";

    public static void main(String[] args) {
        // The former says to use the string pool normally.
        String name1 = "Fluffy"; // string literal - immutable
        // The second says “No, JVM. I really don’t want you to use the string pool.
        // Please create a new object for me even though it is less efficient.
        String name2 = new String("Fluffy");
        /*String s1 = "123";
        String s2 = "456";*/
        String s3 = "123456";
        System.out.println(s3==(s1+s2)); // false
        System.out.println(s3==("123"+"456")); // true
    }
}
