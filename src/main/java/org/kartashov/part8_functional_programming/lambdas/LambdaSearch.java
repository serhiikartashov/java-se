package org.kartashov.part8_functional_programming.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inet on 3/28/2016.
 */
public class LambdaSearch {

    static List<Animal> animals = new ArrayList<>();
    static {
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
    }

    public static void main(String[] args) {

        // lambda
        print(animals, a -> a.canHop());
        print(animals, Animal::canSwim);
        print(animals, (Animal a) -> { return a.canHop(); });

        // variables
        boolean wantWhetherCanHop = true;
        print(animals, a -> a.canHop() == wantWhetherCanHop);
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals){
            if (checker.test(animal))
                System.out.println(animal + "");
        }
        System.out.println();
    }
}
