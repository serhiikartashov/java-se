package org.kartashov.part5_methods_and_encapsulation.method_declaration;

/**
 * Created by Serhii K. on 10/19/2015.
 */
public class MethodDeclaration {

    // accessors
    final public void foo1() {
    }

    static public void foo2() {
    }

    // return type
    public void walk1() {
        return ;
    }

    public void walk2() {
        return;
    }

    public String walk3() {
        return "";
    }

    //public String walk4() {}  // DOES NOT COMPILE
    //public walk5() { }  // DOES NOT COMPILE
    //String walk6(int a) { if (a == 4) return ""; }  // DOES NOT COMPILE

    int integer() {
        return 9;
    }

    //    int long() { // reserved word 'long'!
    //        return 9; // DOES NOT COMPILE
    //    }

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        walk(1);                    // 0
        walk(1, 2);                 // 1
        walk(1, 2, 3);              // 2
        walk(1, new int[]{4, 5});   // 2
        //walk(1, null);  // throws a NullPointerException
        run1(11, 22);                 // 22
        //run1(11, "22");                 // DOES NOT COMPILE
        run2(new int[]{11, 22});      // 22
    }

    public static void run1(int... nums) {
        System.out.println(nums[1]);
    }

    public static void run2(int[] nums) {
        System.out.println(nums[1]);
    }
    final int i = 4;

    public String m(){
        if (i>5){
            return "";
        } else {
            return "";
        }
    }
}
