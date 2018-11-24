package org.kartashov.part5_methods_and_encapsulation.passing_data_among_methods;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Data {

    public static void main(String[] args) {
        int num = 4;
        newNumber(5);
        System.out.println(num);

        String name = "Webby";
        speak(name);
        System.out.println(name);

        StringBuilder name1 = new StringBuilder();
        speak1(name1);
        System.out.println(name); // Webby
    }

    public static void newNumber(int num) {
        num = 8;
    }

    public static void speak(String name) {
        name = "Sparky";
    }

    private static void speak1(StringBuilder name1) {
        name1.append("Webbby");
    }
}
