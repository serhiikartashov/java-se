package org.kartashov.part5_methods_and_encapsulation.overloading;

/**
 * Created by Serhii on 26.10.2015.
 */
public class Doer {

    public void doer(char i){
        System.out.println("char");
    }

    public void doer(int i){
        System.out.println("int");
    }

    public void doer(short i){
        System.out.println("short");
    }
    public String doer(short i, int a){
        System.out.println("short");
        return "";
    }

    public static void main(String[] args) {
        new Doer().doer('a');
        new Doer().doer((short)1);
    }
}
