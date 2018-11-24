package org.kartashov.part5_methods_and_encapsulation.predicates;


import org.kartashov.part8_functional_programming.lambdas.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Serhii K. on 10/20/2015.
 */
public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a->a.canHop());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals){
            if (checker.test(animal))
                System.out.println(animal + "");
        }
        System.out.println();
    }
}
