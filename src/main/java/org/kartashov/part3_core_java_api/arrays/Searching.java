package org.kartashov.part3_core_java_api.arrays;

import java.util.Arrays;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class Searching {

    public static void main(String[] args) {
        int[] numbers = {2,4,6,8}; // sorted array
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        // 1 isn’t in the list, the search can determine that it
        // should be inserted at element 0 to preserve the sorted order.
        // Since 0 already means something for array indexes,
        // Java needs to subtract 1 to give us the answer of –1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        // line 8 wants to tell us that 9 should be inserted at index 4.
        // We again negate and subtract 1, getting –4 –1, also known as –5.
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        int[] numbers_1 = new int[] {3,2,1};
        // array isn't sorted = unpredictable output
        System.out.println(Arrays.binarySearch(numbers_1, 2));
        System.out.println(Arrays.binarySearch(numbers_1, 3));

    }

}
