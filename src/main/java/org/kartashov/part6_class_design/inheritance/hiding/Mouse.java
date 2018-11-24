package org.kartashov.part6_class_design.inheritance.hiding;

/**
 * Created by Serhii K. on 10/26/2015.
 */
class Rodent {
    protected int tailLength = 4;

    public void getRodentDetails() {
        System.out.println("[parentTail=" + tailLength + "]");
    }

    private void foo(){}
}

public class Mouse extends Rodent {
    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
    }

    // it's not override!
    /*Only methods that are accessible can be overridden.
    A private method cannot, therefore, be overridden in subclasses,
    but the subclasses are allowed to define a new method with
    exactly the same signature.*/
    private void foo(){}

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
}
