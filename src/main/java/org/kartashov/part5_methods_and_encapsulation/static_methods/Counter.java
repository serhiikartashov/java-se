package org.kartashov.part5_methods_and_encapsulation.static_methods;

import java.util.ArrayList;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Counter {
    private static final int NUM_BUCKETS = 45;
    private static final ArrayList<String> values = new ArrayList<>();
    private static int count;

    public Counter() {
        count++;
    }

    private static final int NUM_SECONDS_PER_HOUR;

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count);      // 3
        // NUM_BUCKETS = 4; DOES NOT COMPILE

        // compiler can do is check that we don’t try to reassign
        // the finalll values to point to a different object.
        values.add("changed");
    }

    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numMinutesPerHour * numSecondsPerMinute;
    }

    private static int one;
    private static final int two;
    private static final int three = 3;
    // private static final int four;     // DOES NOT COMPILE

    static {
        one = 1;
        two = 2;
        //three = 3;     // DOES NOT COMPILE
        //two = 4;     // DOES NOT COMPILE
    }

}
