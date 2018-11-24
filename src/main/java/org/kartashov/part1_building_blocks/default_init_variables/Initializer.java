package org.kartashov.part1_building_blocks.default_init_variables;

/**
 * Created by Serhii K. on 30.09.2015.
 */
public class Initializer {

    /*
    public int notValid() {
        int y = 10;
        int x;
        int reply = x + y; // DOES NOT COMPILE
        return reply;
    }
    */


    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        // System.out.println(teenyBit);  // DOES NOT COMPILE
    }
}
