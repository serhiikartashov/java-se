package org.kartashov.part2_operators_and_statements.addition_binary_operators;

import java.io.File;

/**
 * Created by Serhii K. on 02.10.2015.
 */
public class Operators {

    public static void main(String[] args) {
        long x = 10;
        int y = 5;
        // y = y *x; // DOES NOT COMPILE
        // The compound operator will fi rst cast x to a long,
        // apply the multiplication of two long values,
        // and then cast the result to an int.
        y *=x;

        // The exam creators are fond of inserting the assignment operator =
        // in the middle of an expression and using the value of the assignment
        // as part of a more complex expression.
        long x2 = 5;
        long y2 = (x2=3);
        System.out.println(x2); // Outputs 3
        System.out.println(y2); // Also, outputs

        // Because x >= 6 is true, the increment operator on the right-hand side
        // of the expression is never evaluated, so the output is 6.
        int x3 = 6;
        boolean y3 = (x3 >= 6) || (++x3 <= 7);
        System.out.println(x3);

        File x4 = new File("myFile.txt");
        File y4 = new File("myFile.txt");
        File z4 = x4; System.out.println(x4 == y4);  // Outputs false
        System.out.println(x4 == z4);  // Outputs true
        // comparison of references NOT objects!
        int u,i,p;
        u=i=p=1;
        System.out.println(u);
        System.out.println(i);
        System.out.println(p);
    }
}
