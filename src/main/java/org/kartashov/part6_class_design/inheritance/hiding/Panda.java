package org.kartashov.part6_class_design.inheritance.hiding;

/**
 * Created by Serhii K. on 10/26/2015.
 */
class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }


    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    public static void main(String[] args) {
        Panda.eat();
    }
}

class Panda2 extends Bear {
    /*public void sneeze() {  // DOES NOT COMPILE
        System.out.println("Panda bear sneezes quietly");
    }*/

    /*public static void hibernate() {  // DOES NOT COMPILE
        System.out.println("Panda bear is going to sleep");
    }*/
}