package org.kartashov.part6_class_design.review_questions;

/**
 * Created by Serhii K. on 10/27/2015.
 */
interface HasExoskeleton {
    abstract int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton {
    abstract int getNumberOfLegs();
}

/*public class Beetle extends Insect {
    int getNumberOfLegs() {
        return 6;
    }
}*/
