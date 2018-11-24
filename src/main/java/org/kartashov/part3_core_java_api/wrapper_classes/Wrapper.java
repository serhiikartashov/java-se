package org.kartashov.part3_core_java_api.wrapper_classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class Wrapper {

    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        String s = "s";
        char c = s.charAt(0);

        List<Double> weights = new ArrayList<>();
        weights.add(50.5);                      // [50.5]
//        weights.add(new Double(60));            // [50.5, 60.0]
        weights.add(Double.valueOf(60));            // [50.5, 60.0]
        weights.remove(50.5);                   // [60.0]
        double first = weights.get(0);          // 60.0

        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        // Java tries to get the int value of null.
        // int h = heights.get(0);          // NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers); // output 1
        // If you want to remove the 2,
        // you can write numbers.remove(new Integer(2))
        // to force wrapper class use.
    }
}
