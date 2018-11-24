package org.kartashov.part3_core_java_api.dates_and_times;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Created by Serhii K. on 06.10.2015.
 */
public class Periods {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);               // create a period
        performAnimalEnrichment(start, end, period);


        Period annually = Period.ofYears(1);            // every 1 year   P1Y
        Period quarterly = Period.ofMonths(3);          // every 3 months P3M
        Period everyThreeWeeks = Period.ofWeeks(3);     // every 3 weeks  P21D
        Period everyOtherDay = Period.ofDays(2);        // every 2 days   P2D
        Period everyYearAndAWeek = Period.of(1, 0, 7);  // every year and 7 days
                                                        // P1Y7D

        // tricky! it's not P1Y7D!!!
        Period wrong = Period.ofYears(1).ofWeeks(1);    // every week! P7D
        System.out.println(wrong);

    }

    private static void performAnimalEnrichment(LocalDate start,
                                                LocalDate end,
                                                Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);     // adds the period
        }
    }
}
