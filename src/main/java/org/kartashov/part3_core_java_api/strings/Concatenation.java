package org.kartashov.part3_core_java_api.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class Concatenation {

    public static void main(String[] args) {
        System.out.println(1 + 2);           // 3
        System.out.println("a" + "b");       // ab
        System.out.println("a" + "b" + 3);   // ab3
        System.out.println(1 + 2 + "c");     // 3c

        String s = "1";             // s currently holds "1"
        s += "2";                   // s currently holds "12"
        s += 3;                     // s currently holds "123"
        System.out.println(s);      // 123

        String message = String.join("-", "Java", "is", "cool");
        System.out.println(message);

        List<String> list = new ArrayList<String>(){
            {add("Java");add("is");add("cool");}
        };
        String newmessage = String.join("-", list);
        System.out.println(newmessage);

        String s1 = "123";
        String s2 = "456";
        s1 = s1.concat(s2);
        System.out.println(s1);
    }
}
