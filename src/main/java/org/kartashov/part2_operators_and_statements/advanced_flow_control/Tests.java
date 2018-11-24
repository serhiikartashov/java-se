package org.kartashov.part2_operators_and_statements.advanced_flow_control;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class Tests {

    public static void main(String[] args) {
        int x = 0;
        /*while (false) {
            x = 3;
        }*/
        if (false) {
            x = 3;
        }
        do {
            x = 3;
        } while (false);

        for (int i = 0; i < 0; i++) x = 3;

        /*This is an invalid use of ? : operator. Both sides of : should return the same type (excluding void).
        Here, break and continue do not return anything. However, the following would have been valid:
        for(;Math.random()<.05? true : false;){  }*/
        /*for (; ; ) {
            Math.random() < .05 ?break:continue;
        }*/
        new Tests().crazyLoop();
        // output 0-4
    }

    void crazyLoop() {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:
            System.out.println(c);
            if (c > 3) break JACK;
            else c++;
        }
    }
}
