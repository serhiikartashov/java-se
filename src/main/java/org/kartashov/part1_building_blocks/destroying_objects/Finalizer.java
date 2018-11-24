package org.kartashov.part1_building_blocks.destroying_objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhii K. on 30.09.2015.
 */
public class Finalizer {

    private int i;

    private static List objects = new ArrayList();

    public Finalizer(int i) {
        this.i = i;
    }

    // The Cleaner and PhantomReference provide more flexible and efficient ways to release resources when an object becomes unreachable.
    // deprecated since java 9
//    protected void finalize() {
//        System.out.println(i + ": Calling finalize");
//        objects.add(this);
//    }

//    public static void main(String[] args) {
//        int i = 0;
//        while (i<=50){
//        /*while (i<=532530){*/
//            Finalizer fin = new Finalizer(i);
//            i++;
//            System.gc();
//        }
//
//    }
}
