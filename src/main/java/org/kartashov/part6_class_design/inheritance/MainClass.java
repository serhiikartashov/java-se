package org.kartashov.part6_class_design.inheritance;

/**
 * Created by Serhii K. on 10/26/2015.
 */
public class MainClass {

    /*
    1. First of all we have static initialization in A class.
    2. Secondary static initialization in B class.
    3. Then we have declaration of non static variables of A class.
    4. Then we go to the Constructor of A class, but the a is not defined in B yet. That's why it is 0;
    5. Then we have declaration of a variable in B class.
    */
    public static void main(String argv[]) {
        new B();
        //new A();
    }
}

class A {

    int a = 5;

    public void out() {
        System.out.print(a + " A class \n");
    }

    A() {
        this.out();
    }
}

class B extends A {
    int a = 3;

    public void out() {
        System.out.print(a + " B class \n");
    }

    B() {
        super();

    }
}