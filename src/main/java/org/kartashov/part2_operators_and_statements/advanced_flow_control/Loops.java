package org.kartashov.part2_operators_and_statements.advanced_flow_control;

/**
 * Created by Serhii K. on 02.10.2015.
 */
public class Loops {

    public static void main(String[] args) {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

        /*int x = 20;
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.print(x + "\t");
        }*/

        int[][] myComplexArray1 = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray1) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
            // break OUTER_LOOP;
            // continue OUTER_LOOP;
        }

        System.out.println("My Complex array");
        System.out.println(myComplexArray);

        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b') continue FIRST_CHAR_LOOP;
                System.out.print(" " + a + x);
            }
        }
        Boolean.valueOf(true);

    }
}
