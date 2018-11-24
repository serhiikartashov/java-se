package org.kartashov.part6_class_design.polymorphism;

/**
 * Created by Serhii K. on 10/27/2015.
 */
class Rodent{}

public class Capybara {

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        // Capybara capybara = (Capybara) rodent; // Throws ClassCastException at runtime
    }
}
