package org.kartashov.part6_class_design.inheritance;

/**
 * Created by Serhii K. on 10/26/2015.
 */
class A1{
    int a=5;
    public void out() {
        System.out.print(a + " A class \n");
    }

    A1(){
        this.out();
        System.out.println("Non static variable a of A class "+this.a);

    }
    static {
        System.out.println("static A");
    }
    {
        System.out.println("non Static A");
    }
}

class B1  extends A1 {
    {
        System.out.println("non Static B");
    }
    static {
        System.out.println("static B");
    }
    int a=3;
    public void out() {
        System.out.print(a + " B class \n");
    }
    B1(){
        super();

    }
}

public class KoalaTester1 {
    public static void main(String[] args) {
        new B1();
    }
}
