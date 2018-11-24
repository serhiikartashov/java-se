package org.kartashov.part3_core_java_api.arrays;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class MultidimensionalArrays {

    static int[] x = new int[0];

    static{ x[0] = 10; }

    int[][] vars1;          // 2D array
    int vars2[][];         // 2D array
    int[] vars3[];          // 2D array
    int[] vars4[], space[][];  // a 2D AND a 3D array
    int[][] vars5[];  // 3D array

    public static void main(String[] args) {
        // size specification
        String[][] rectangle = new String[3][2];
        rectangle[0][1] = "set";

        int[][] differentSize = {{1, 4}, {3}, {9, 8, 7}};

        int[][] args1 = new int[4][];
        args1[0] = new int[5];
        args1[1] = new int[3];


        int[][] twoD = new int[3][2];

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println();                 // time for a new row
        }

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }

        String[][][] arr = {
                {
                        {"a", "b", "c"}, {"d", "e", null}
                },
                {
                        {"x"}, null
                },
                {
                        {"y"}
                },
                {
                        {"z", "p"}, {}
                }
        };
        System.out.println(arr[0][1][2]);

        MultidimensionalArrays mda = new MultidimensionalArrays(); // Exception in thread "main" java.lang.ExceptionInInitializerError

    }
}