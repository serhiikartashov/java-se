package org.kartashov.part3_core_java_api.strings;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class Immutable {

    private String s = "name";

    public String getS() {
        return s;
    }

    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
        // output 12
    }
}
