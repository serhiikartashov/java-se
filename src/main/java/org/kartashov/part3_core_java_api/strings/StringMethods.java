package org.kartashov.part3_core_java_api.strings;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class StringMethods {

    public static void main(String[] args) {

        // length()
        String string = "animals";
        System.out.println(string.length()); // 7

        System.out.println(string.charAt(0));  // a
        System.out.println(string.charAt(6));  // s
        //System.out.println(string.charAt(7));  // throws exception at runtime
        // java.lang.StringIndexOutOfBoundsException

        System.out.println(string.indexOf('a'));         // 0
        System.out.println(string.indexOf("al"));        // 4
        System.out.println(string.indexOf('a', 4));      // 4
        // doesn't find anything!
        System.out.println(string.indexOf("al", 5));     // -1

        System.out.println(string.substring(3));  // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals

        System.out.println(string.substring(3, 3)); // empty string
        //System.out.println(string.substring(3, 2)); // throws exception
        //System.out.println(string.substring(3, 8)); // throws exception

        // Also, remember that strings are immutable, so the original string stays the same.
        System.out.println(string.toUpperCase());  // ANIMALS
        System.out.println("Abc123".toLowerCase());  // abc123

        System.out.println("abc".equals("ABC"));  // false
        System.out.println("ABC".equals("ABC"));  // true
        System.out.println("abc".equalsIgnoreCase("ABC"));  // true

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        //  The trim() method removes whitespace from the beginning and end of a String.
        System.out.println("abc".trim());           // abc
        System.out.println("\t   a b c\n".trim()); // a b c


        String result = "AniMaL   ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);

        String x = "Hello World";
        String z = " Hello World".trim(); // trim return new object! reference
        System.out.println(x == z); // false
        System.out.println(x.equals(z)); // true

        System.out.println("abc".concat("!!!"));
    }
}
