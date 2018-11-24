package org.kartashov.part8_functional_programming.functional_interface.nonfunctional;


import org.kartashov.part8_functional_programming.functional_interface.Animal;
import org.kartashov.part8_functional_programming.functional_interface.Sprint;

/**
 * Created by Serhii K. on 2/4/2016.
 */
// NON FUNCTIONAL INTERFACE!
public interface Dance extends Sprint {
    void dance(Animal animal);
}