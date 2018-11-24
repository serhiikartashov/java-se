package org.kartashov.part3_core_java_api.stringbuilder;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class StringBuilderMethods {

    public static void main(String[] args) {
        // new StringBuilder() was called only once
        // array of characters
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        // two variables are referring to the same object
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // super(str.length() + 16);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Animal");
        // capacity - number of slots for characters
        StringBuilder sb3 = new StringBuilder(10);

        new StringBuilderMethods().capacity();

        StringBuilder sb_ = new StringBuilder();
        System.out.println(sb_.capacity()); // 16
        sb_.ensureCapacity(17);
        System.out.println(sb_.capacity()); // 34
        sb_.ensureCapacity(100);
        System.out.println(sb_.capacity()); // 100

        // charAt(), indexOf(), length(), and substring()
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        sb.charAt('a');
        System.out.println(sub + " " + len + " " + ch);

        // setLength
        StringBuilder sb__ = new StringBuilder("12345678");
        System.out.println(sb__.toString());
        System.out.println(sb__.capacity());
        System.out.println(sb__.length());
        sb__.setLength(5);
        System.out.println(sb__.toString());
        System.out.println(sb__.capacity());
        System.out.println(sb__.length());
        sb__.setLength(10);
        System.out.println(sb__.toString());
        System.out.println(sb__.capacity());
        System.out.println(sb__.length());

        // append()
        StringBuilder sb_1 = new StringBuilder().append(1).append('c');
        sb_1.append("-").append(true);
        System.out.println(sb_1);      // 1c-true

        // insert()
        StringBuilder sb_2 = new StringBuilder("animals");
        sb_2.insert(7, "-");      // sb = animals-
        sb_2.insert(0, "-");      // sb = -animals-
        sb_2.insert(4, "-");      // sb = -ani-mals-
        System.out.println(sb_2); // -ani-mals-

        // delete() and deleteCharAt()
        StringBuilder sb_3 = new StringBuilder("abcdef");
        //  delete the characters starting with index 1 and
        // ending right before index 3.
        sb_3.delete(1, 3);     // sb = adef
        //sb_3.deleteCharAt(5);  // throws an exception
        System.out.println(sb_3);

        // reverse()
        StringBuilder sb_4 = new StringBuilder("ABC");
        System.out.println("before reverse: " + sb_4);
        sb_4.reverse();
        System.out.println("after reverse: " + sb_4.toString());
        System.out.println("after reverse: " + sb_4);

    }

    public void capacity() {
        // multiply on two and add 2 slots
        StringBuilder sb = new StringBuilder(5);
        sb.append("anim");
        System.out.println("capacity: " + sb.capacity()); // 5
        sb.append("als"); // 12
        sb.append("als123456"); // 13 - just add as need after increase
        System.out.println("capacity: " + sb.capacity()); // 26
    }
}
