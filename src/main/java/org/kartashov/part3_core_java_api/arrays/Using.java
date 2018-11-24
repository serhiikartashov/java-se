package org.kartashov.part3_core_java_api.arrays;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class Using {

    public static void main(String[] args) {
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);           // 3
        System.out.println(mammals[0]);               // monkey
        System.out.println(mammals[1]);               // chimp
        System.out.println(mammals[2]);               // donkey

        String[] birds = new String[6];
        System.out.println(birds.length); // 6
    }
}
