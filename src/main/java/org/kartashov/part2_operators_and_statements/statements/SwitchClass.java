package org.kartashov.part2_operators_and_statements.statements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhii K. on 11/11/2015.
 */
public class SwitchClass {

    public void switchString(String input){
        switch(input){
            case "a" : System.out.println( "apple" );
            case "b" : System.out.println( "bat" );
                break;
            case "B" : System.out.println( "big bat" );
            default : System.out.println( "none" );
        }
    }

    public static void main(String[] args) throws Exception {
        SwitchClass tc = new SwitchClass();
        tc.switchString("B");

        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++){
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);

        List<String> places = new ArrayList<String>() {

            { add("x"); add("y"); }

        };
        System.out.println(places);


        String str1 = "one"; String str2 = "two"; System.out.println( str1.equals(str1=str2) );
        System.out.println(Math.round(Double.parseDouble("-0.5")));
    }
}
