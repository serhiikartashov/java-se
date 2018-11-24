package org.kartashov.part3_core_java_api.stringbuilder;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class WhyToUse {

    /*
     * The next time through the loop, alpha is assigned a new String object, "ab",
     * and the "a" object becomes eligible for garbage collection.
     * The next iteration assigns alpha to "abc" and the "ab" object
     * becomes eligible for garbage collection, and so on.
     */
    public void string() {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) alpha += current;
        System.out.println(alpha);
    }

    /*
     * The StringBuilder class creates a String without storing all those
     * interim String values. Unlike the String class,
     * StringBuilder is not immutable.
     */
    public void stringBuilder() {
        StringBuilder alpha = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) alpha.append(current);
        System.out.println(alpha);
    }

    public static void main(String[] args) {
        new WhyToUse().string();
        new WhyToUse().stringBuilder();
    }
}
