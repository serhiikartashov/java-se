package org.kartashov.part14_reflection.classes;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class RetrievingClassObjects {

    enum E { A, B }

    public static void main(String[] args) {
        System.out.println("foo".getClass());
        Class<? extends Properties> aClass = System.getProperties().getClass();
        System.out.println(aClass);

        Class c = E.A.getClass();
        System.out.println(c);

        Set<String> s = new HashSet<>();
        Class c2 = s.getClass();
        System.out.println(c2);

        // For primitives
        boolean b;
//        Class cb = b.getClass();   // compile-time error
        Class cb = boolean.class;  // correct

        Class c3 = java.io.PrintStream.class;

        Class c4 = int[][][].class;

        System.out.println(c4);

        try {
            Class c5 = Class.forName("org.kartashov.part14_reflection.classes.RetrievingClassObjects");
            System.out.println(c5);

            Class cDoubleArray = Class.forName("[D");
            Class cStringArray = Class.forName("[[Ljava.lang.String;");
            Class c6 = Double.TYPE;
            System.out.println(c6);
            System.out.println(Void.TYPE);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class c7 = javax.swing.JButton.class.getSuperclass();
        System.out.println(c7);

        // public classes
        System.out.println(Arrays.toString(Character.class.getClasses()));

        // all classes
        System.out.println(Arrays.toString(Character.class.getDeclaredClasses()));

        /*
        *   Class.getDeclaringClass()
        *   java.lang.reflect.Field.getDeclaringClass()
        *   java.lang.reflect.Method.getDeclaringClass()
        *   java.lang.reflect.Constructor.getDeclaringClass()
        */

        try {
            Field f = System.class.getField("out");
            Class c8 = f.getDeclaringClass();
            System.out.println(c8);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        Class c9 = Thread.State.class.getEnclosingClass();
        System.out.println(c9);

    }
}
