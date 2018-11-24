package org.kartashov.part5_methods_and_encapsulation.order_init;

/**
 * Created by Serhii K. on 10/20/2015.
 */
public class InitializationOrderSimple {

    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    {
        COUNT+=2;
        System.out.println(COUNT);
    }

    public InitializationOrderSimple() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read to construct");
        InitializationOrderSimple init = new InitializationOrderSimple();

    }
}


