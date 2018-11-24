package org.kartashov.part3_core_java_api.dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Formatter;

/**
 * Created by Serhii K. on 06.10.2015.
 */
public class FormattingDatesAndTimes {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek());     // MONDAY
        System.out.println(date.getMonth());         // JANUARY
        System.out.println(date.getYear());          // 2020
        System.out.println(date.getDayOfYear());     // 20

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
        System.out.println("ISO_LOCAL_DATE: " + date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("ISO_LOCAL_TIME: " + time1.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("ISO_LOCAL_DATE_TIME: " + dateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println("ISO_DATE: " + date1.format(DateTimeFormatter.ISO_DATE));
        System.out.println("ISO_TIME: " + time1.format(DateTimeFormatter.ISO_TIME));
        System.out.println("ISO_DATE_TIME: " + dateTime1.format(DateTimeFormatter.ISO_DATE_TIME));

        // System.out.println("RFC_1123_DATE_TIME: " + dateTime1.format(DateTimeFormatter.RFC_1123_DATE_TIME));

        DateTimeFormatter shortDateTime = DateTimeFormatter.
                ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime1));// 1/20/20
        System.out.println(shortDateTime.format(date));     // 1/20/20
        //System.out.println(shortDateTime.format(time1));    // UnsupportedTemporalTypeException

        DateTimeFormatter shortDateTime1 = DateTimeFormatter.
                ofLocalizedTime(FormatStyle.SHORT);
        //ofLocalizedDateTime(FormatStyle.SHORT);
        //DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        //System.out.println(dateTime1.format(shortDateTime1));
//        System.out.println(date1.format(shortDateTime1));
        System.out.println(time1.format(shortDateTime1));


        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time2 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("Short Format Style: " + shortF.format(dateTime2));     // 1/20/20 11:12 AM
        System.out.println("Medium Format Style: " + mediumF.format(dateTime2));     // Jan 20, 2020 11:12:34 AM

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime2.format(f));     // January 20, 2020, 11:12

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(f1.format(dateTime2));
        // f1.format(date2); java.time.temporal.UnsupportedTemporalTypeException
        System.out.println(f1.format(time2));

        // parsing dates and time
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date3 = LocalDate.parse("01 02 2015", f3);
        LocalTime time3 = LocalTime.parse("11:22");
        System.out.println(date3);          // 2015-01-02
        System.out.println(time3);          // 11:22
        // Parsing is consistent in that if anything goes wrong,
        // Java throws a runtime exception

        Integer I1 = 0;
        Integer I2 = -1;
        Integer I3 = 1;
        Formatter f11 = new Formatter();
        f11.format("%1$b ", I1.toString())
                .format("%1$b ", I2.toString())
                .format("%1$b ", I3.toString());
        System.out.println(f11.toString());
    }
}
