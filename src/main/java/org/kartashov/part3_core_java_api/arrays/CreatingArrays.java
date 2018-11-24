package org.kartashov.part3_core_java_api.arrays;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class CreatingArrays {

    public static void main(String[] args) {
        // indexing starts from 0
        int[] numbers1 = new int[3]; // all values has default int value - 0
        int[] numbers2 = new int[]{42, 55, 99};

        java.util.Date[] dates1[] = new java.util.Date[2][];
        //java.util.Date[] dates2[] = new java.util.Date[][2]; // DOES NOT COMPILE

        // anonymous array: don't speficy the type and size
        int[] numbers2_1 = {42, 55, 99};

        // possible declarations
        int[] numAnimals;
        int[] numAnimals2;
        int numAnimals3[];
        int numAnimals4[];

        int[] ids_1, types_1; // two variables of type int[]
        int ids_2[], types_2; // first variable of type: int[], second: int

    }
}
