package org.kartashov.part1_building_blocks.package_and_import_declaration;

/**
 * Created by Serhii K. on 29.09.2015.
 */
public class Conflicts2 {

    java.util.Date date;
    java.sql.Date sqlDate;

    /*
     * Basically databases usually support at least three forms of datetime fields which are date, time and timestamp.
     * Each of these have a corresponding class in JDBC and each of them extend java.util.Date.
     * Quick semantics of each of these three are the following:
     *
     * java.sql.Date corresponds to SQL DATE which means it stores years, months and days while hour, minute, second and
     * millisecond are ignored. Additionally sql.Date isn't tied to timezones.
     *
     * java.sql.Time corresponds to SQL TIME and as should be obvious, only contains information about hour, minutes,
     * seconds and milliseconds.
     *
     * java.sql.Timestamp corresponds to SQL TIMESTAMP which is exact date to the nanosecond (note that util.Date only
     * supports milliseconds!) with customizable precision.
     *
     * One of the most common bugs when using JDBC drivers in relation to these three types is that the types are
     * handled incorrectly. This means that sql.Date is timezone specific, sql.Time contains current year, month and day et cetera et cetera.
     */

}
