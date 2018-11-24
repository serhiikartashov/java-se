package org.kartashov.part6_class_design.review_questions;

/**
 * Created by Serhii K. on 10/27/2015.
 */
class Rodent {
    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}

public class Beaver extends Rodent {
    /*public Number chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }*/
}
