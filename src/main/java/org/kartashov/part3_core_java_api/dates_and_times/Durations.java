package org.kartashov.part3_core_java_api.dates_and_times;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by Serhii K. on 06.10.2015.
 */
public class Durations {

    public static void main(String[] args) {
        Instant t1 = Instant.now();
        Instant t2 = Instant.EPOCH;
        Duration duration = Duration.between(t1, t2);
        System.out.println(duration);

    }
}
