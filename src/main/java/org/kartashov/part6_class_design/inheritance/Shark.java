package org.kartashov.part6_class_design.inheritance;

/**
 * Created by Serhii K. on 10/26/2015.
 */
class Fish {
    protected int size;
    private int age;

    public Fish(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    /*public Shark(int age) {
        super;  // DOES NOT COMPILE
        super().setAge(10);  // DOES NOT COMPILE
    }*/

    public void displaySharkDetails1() {
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
    }

    public void displaySharkDetails2() {
        System.out.print("Shark with age: " + this.getAge());
        System.out.print(" and " + this.size + " meters long");
        System.out.print(" with " + this.numberOfFins + " fins");
    }

    public void displaySharkDetails3() {
        System.out.print("Shark with age: " + super.getAge());
        System.out.print(" and " + super.size + " meters long");
        System.out.print(" with " + this.numberOfFins + " fins");
    }

    public void displaySharkDetails4() {
        System.out.print("Shark with age: " + super.getAge());
        System.out.print(" and " + super.size + " meters long");
        // System.out.print(" with " + super.numberOfFins + " fins"); // DOES NOT COMPILE
    }

    private Object method(){
        return this;
    }
}