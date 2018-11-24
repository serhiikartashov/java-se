package org.kartashov.part5_methods_and_encapsulation.predicates;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhii K. on 10/20/2015.
 */
public class RemoveIf {

    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);     // [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies);     // [hoppy]
    }
}
