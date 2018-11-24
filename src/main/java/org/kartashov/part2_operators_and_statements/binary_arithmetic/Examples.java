package org.kartashov.part2_operators_and_statements.binary_arithmetic;

/**
 * Created by Serhii K. on 01.10.2015.
 */
public class Examples {

    public static void main(String[] args) {
        System.out.println(9 / 3);  // Outputs 3
        System.out.println(9 % 3);  // Outputs 0

        System.out.println(10 / 3);  // Outputs 3
        System.out.println(10 % 3);  // Outputs 1

        System.out.println(11 / 3);  // Outputs 3
        System.out.println(-11 % 3);  // Outputs 2

        System.out.println(-12 / 3);  // Outputs 4
        System.out.println(-12 % 3);  // Outputs 0

        System.out.println(0 % 3);  // Outputs 0
        System.out.println(1 % 3);  // Outputs 0

        int x = 1;
        long y = 33;
        long z1 = y*x;
        int z2 = (int)y*x;
        int z22 = x*(int)y;

        double x1 = 39.21;
        float y1 = 2.1f;
        double z3 = y1 + x1;

        short x2 = 10;
        short y2 = 3;
        int z = x2/y2;

        byte b1 = 5;
        byte b2 = 10;
        double b3 = b1+b2;
        int b4 = b1+b2;
        long b5 = b1+b2;
        //byte b6 = (byte)b1+b2;
        byte b6 = (byte)(b1+b2);


        /*
        First, x will automatically be promoted to int solely because it is a short
        and it is being used in an arithmetic binary operation.
        The promoted x value will then be automatically promoted to a float
        so that it can be multiplied with y.
        The result of x * y will then be automatically promoted to a double,
        so that it can be multiplied with z, resulting in a double value.
        */

        short x3 = 14;
        float y3 = 13;
        double z4 = 30;
        double result = x3*y3/z4;

        Examples ex = new Examples();
        ex.foo();

        //1*1%2
        System.out.println("mod: " + 1*2%3);
    }

    public void foo(){
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for (int x : list) {
            System.out.print(x + ", ");
            break;
        }

        System.out.println(list);

        String[] strings = {"sss", "kkk", "ddd"};
        System.out.println(strings);

        //int[][] a = new int[][5];
    }
}
