package org.kartashov.part6_class_design.review_questions;

/**
 * Created by Serhii K. on 10/27/2015.
 */
class Arthropod {

    public void printName(double input) {
        System.out.print("Arthropod");
    }
}

public class Spider extends Arthropod {

    public void printName(int input) {
        System.out.print("Spider");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName(4);
        spider.printName(9.0);
    }

}