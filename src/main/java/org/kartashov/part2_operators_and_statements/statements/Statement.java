package org.kartashov.part2_operators_and_statements.statements;

import java.util.ArrayList;

/**
 * Created by Serhii K. on 02.10.2015.
 */
public class Statement {

    static {System.out.println("Static"); }

    public static void main(String[] args) {

        boolean a = false;
        boolean b = false;
        if (a=b){

        }
        int aaa = 0;
        switch (aaa){
            case 'd':
        }



        // if-then-else
        int hourOfDay = 4;
        if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if (hourOfDay < 11) {
            System.out.println("Good Morning");  // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }

        // ternary operator
        int y = 10;
        int x = (y > 5) ? (2 * y) : (3 * y);
        /*
        int y = 10;
        final int x;
        if (y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
        */
        System.out.println((y > 5) ? 21 : "Zebra");
        // int Animal = (y < 91) ? 9 : "Horse";  // DOES NOT COMPILE


        /*This means that for the given value of dayOfWeek, 5,
        the code will jump to the default block and then
        execute all of the proceeding case statements in order until
        it finds a break statement or finishes the structure*/
        // int dayOfWeek = 0; // output: Sunday, Weekday, Saturday
        int dayOfWeek = 5;
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
        switch (dayOfWeek){

        }

        int x1 = 0;
        do {
            x1++;
        } while (false);
        System.out.println(x1);  // Outputs 1

        /*
        if (x > 10) {
            do {
                x--;
            } while (x > 10);
        } else {
            x++;
        }
        */

        // infinite Loop
        // for( ; ; ) {  System.out.println("Hello World"); }
        // for( ; ) and for( ) will not compile.

        // The variables in the initialization block must all be of the same typ
        /*for (long y2 = 0, int x2 = 4;x< 5 && y < 10;x++, y++){   // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/

        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for (String name : names) {
            System.out.print(name + ", ");
        }

        java.util.List<String> values = new ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for (String value : values) {
            System.out.print(value + ", ");

        }
    }

    int roomInBelly = 5;
    public void eatCheese(int bitesOfCheese){
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }


    //  the case statement value must also be
    // a literal, enum constant, or final constant variable
    /*private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
            case middleName:  // DOES NOT COMPILE
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName:  // DOES NOT COMPILE
                id = 8;
                break;
            case 5:  // DOES NOT COMPILE
                id = 7;
                break;
            case 'J':  // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE  Enum doesn't match type of String
                id = 15;
                break;
        }
        return id;
    }*/
    //Object object[] = new Object[]{ "aaa", new Object(), new ArrayList(), new String[]{""} };
    //Object object[] = new Object[]{ "aaa", new Object(), new ArrayList(), {} };
}
