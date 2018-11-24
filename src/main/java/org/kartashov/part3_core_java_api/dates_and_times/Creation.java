package org.kartashov.part3_core_java_api.dates_and_times;

import java.time.*;

/**
 * Created by Serhii K. on 06.10.2015.
 */
public class Creation {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        // Java uses T to separate the date and time when converting
        // LocalDateTime to a String
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1);
        System.out.println(date2);

        LocalTime time1 =  LocalTime.of(6, 15);             // hour and minute
        LocalTime time2 =  LocalTime.of(6, 15, 30);         // + seconds
        LocalTime time3 =  LocalTime.of(6, 15, 30, 200);    // + nanoseconds

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        // LocalDate d = new LocalDate(); // does not compile - private constructor

        // LocalDate.of(2015, Month.JANUARY, 32);     // throws DateTimeException
        DayOfWeek day1 = DayOfWeek.MONDAY;
        DayOfWeek day2 = DayOfWeek.TUESDAY;
        DayOfWeek day3 = DayOfWeek.WEDNESDAY;
        DayOfWeek day4 = DayOfWeek.THURSDAY;
        DayOfWeek day5 = DayOfWeek.FRIDAY;
        DayOfWeek day6 = DayOfWeek.SATURDAY;
        DayOfWeek day7 = DayOfWeek.SUNDAY;
    }
}
