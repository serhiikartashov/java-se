package org.kartashov.part1_building_blocks.decl_and_init_variables;

/**
 * Created by Serhii K. on 30.09.2015.
 */
public class Declaring {

    String s1, s2;
    String s3="yes", s4="no";

    // only one of those values was initialized: i3
    int i1, i2, i3 = 0;

    // int num, String value; // does not compile!

    boolean b1, b2;
    String s6 = "1", s5;
    //double d1, double d2; // not legal
    double d1; double d2;
    int i7; int i8;
    //int i3; i4; // not legal

    // legal
    int okidentifier;
    int $OK2Identifier;
    int _alsoOK1d3ntifi3r;
    int __SStillOkbutKnotsonice$;

    // not legal
    // 3DPointClass  // identifiers cannot begin with a number
    // hollywood@vine // @ is not a letter, digit, $ or _
    // *$coffee // * is not a letter, digit, $ or _
    // public   // public is a reserved word
}
