package org.kartashov.part8_functional_programming.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhii K. on 10/20/2015.
 */
public class TraditionalSearch {

    static List<Animal> animals = new ArrayList<>();
    static {
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
    }

    public static void main(String[] args) {

        print(animals, new CheckIfHopper());

        print(animals, new CheckTrait() {
            @Override
            public boolean test(Animal a) {
                return a.canSwim();
            }
        });

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals){
            if (checker.test(animal))
                System.out.println(animal + "");
        }
        System.out.println();
    }
}
