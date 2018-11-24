package org.kartashov.part1_building_blocks.object_refer_and_primitives;

/**
 * Created by Serhii K. on 29.09.2015.
 */
public class Converters {

    int million1 = 1000000;
    int million2 = 1_000_000;

    //double notAtStart = _1000.00;        // DOES NOT COMPILE
    // double notAtEnd = 1000.00_;          // DOES NOT COMPILE
    // double notByDecimal = 1000_.00;      // DOES NOT COMPILE
    double annoyingButLegal = 1_00_0.0_0;  // this one compiles

    //int value = null;   // DOES NOT COMPILE
    String s = null;

    // all the primitive types have lowercase type names



    public static void main(String[] args) {
        System.out.println(56);       // 56
        System.out.println(0b11);     // 3
        System.out.println(017);      // 15
        System.out.println(0x1F);     // 31

    }
}
