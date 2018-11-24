package org.kartashov.part5_methods_and_encapsulation.overloading;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Glider2 {

    public static String glide(String s) {
        return "1";
    }

    public static String glide(String... s) {
        return "2";
    }

    public static String glide(Object o) {
        return "3";
    }

    public static String glide(String s, String t) {
        return "4";
    }

    public static void main(String[] args) {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
        // 142

        // It cannot handle converting in two steps to a long
        // and then to a Long
        //play(4); // DOES NOT COMPILE
        play(4L);
    }
    public static void play(Long l) {}
    public static void play(Long... l) { }
}
