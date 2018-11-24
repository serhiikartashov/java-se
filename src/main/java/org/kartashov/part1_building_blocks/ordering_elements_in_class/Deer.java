package org.kartashov.part1_building_blocks.ordering_elements_in_class;

/**
 * Created by Serhii K. on 02.10.2015.
 */
public class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());

        Integer i1=128;
        Integer i2=128;
        System.out.println(i1==i2);
        Integer j1 = 127;
        Integer j2 = 127;
        System.out.println(j1==j2);
        String s1="Hello";
        String s2="Hello";
        System.out.println(s1==s2);
        String s11=new String("Hello");
        String s22=new String("Hello");
        System.out.println(s11==s22);
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }
}

