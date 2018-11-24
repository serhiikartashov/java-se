package org.kartashov.part3_core_java_api.arrays;

import java.util.Arrays;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class Sorting {

    public static void main(String[] args) {
        int[] numbers = {6, 9, 1};
        // Dual-Pivot Quicksort from java 1.7
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i] + " ");

        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings); // sorts in alphabetic order
        for (String string : strings) System.out.println(string + " ");
    }


}
