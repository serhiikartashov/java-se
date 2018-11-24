package org.kartashov.part6_class_design.abstract_classes;

/**
 * Created by Serhii K. on 10/27/2015.
 */
public abstract class Animal {

    protected int age;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getName();

    public static void main(String[] args) {
        System.out.println("Abstract");
    }
}

class Swan extends Animal {
    public String getName() {
        return "Swan";
    }
}

/*
public final abstract class Tortoise {  // DOES NOT COMPILE
}
*/

abstract class Goat {
    // public abstract final void chew();  // DOES NOT COMPILE
}

// private!
abstract class Whale {
    //private abstract void sing();  // DOES NOT COMPILE
}

abstract class Whale1 {
    protected abstract void sing();
}

// may be protected or public
/*class HumpbackWhale extends Whale1 {
    private void sing() {  // DOES NOT COMPILE
        System.out.println("Humpback whale is singing");
    }
}*/


abstract class Eagle extends Animal { }