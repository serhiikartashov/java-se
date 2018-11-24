package org.kartashov.part2_operators_and_statements.unary_operators;

/**
 * Created by Serhii K. on 02.10.2015.
 */
public class Unary {

    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        int u = 2;
        System.out.println(u++);
        System.out.println(++u);

        int a = 0;
        int b = 1;
        int c = 2;
        if (a>b & c++>a){
            System.out.println("sss1");

        }
        System.out.println("C: " + c);

        if (a>b && c++>a){
            System.out.println("sss2");
        }
        System.out.println("C: " + c);

        int i = 0;
        i = i++ + i++ + i++;
        System.out.println(i);
        int a1 = 0;
        a1 = a1++ + a1++;
        System.out.println(a1);


    }
}
