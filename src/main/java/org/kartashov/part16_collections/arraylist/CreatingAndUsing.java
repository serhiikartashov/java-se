package org.kartashov.part16_collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Serhii K. on 05.10.2015.
 */
public class CreatingAndUsing {

    ArrayList list1 = new ArrayList();
    // initial capacity - 10
    ArrayList list2 = new ArrayList(10);
    ArrayList list3 = new ArrayList(list2);
    // from java 1.7 diamond operator - <>
    List<String> list6 = new ArrayList<>();
    //ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

    public static void main(String[] args) {

        // add();
        ArrayList list = new ArrayList();
        list.add("hawk");          // [hawk]
        list.add(Boolean.TRUE);    // [hawk, true]
        System.out.println(list);  // [hawk, true]

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //safer.add(Boolean.TRUE);    // DOES NOT COMPILE


        List<String> birds = new ArrayList<>();
        birds.add("hawk");            // [hawk]
        birds.add(1, "robin");        // [hawk, robin]
        birds.add(0, "blue jay");     // [blue jay, hawk, robin]
        birds.add(1, "cardinal");     // [blue jay, cardinal, hawk, robin]
        System.out.println(birds);    // [blue jay, cardinal, hawk, robin]

        // remove();
        List<String> birds_1 = new ArrayList<>();
        birds_1.add("hawk");     // [hawk]
        birds_1.add("hawk");     // [hawk, hawk]
        System.out.println(birds_1.remove("cardinal")); // prints false
        System.out.println(birds_1.remove("hawk")); // prints true
        System.out.println(birds_1.remove(0)); // prints hawk
        System.out.println(birds_1);     // []

        // set();
        // changes one of the elements of the ArrayList without changing the size
        List<String> birds_2 = new ArrayList<>();
        birds_2.add("hawk");                    // [hawk]
        System.out.println(birds_2.size());     // 1
        birds_2.set(0, "robin");               // [robin]
        System.out.println(birds_2.size());     // 1
        //birds_2.set(1, "robin");               // IndexOutOfBoundsException

        // isEmpty() and size();
        List<String> birds_3 = new ArrayList<>();
        System.out.println(birds_3.isEmpty());     // true
        System.out.println(birds_3.size());     // 0
        birds_3.add("hawk");                    // [hawk]
        birds_3.add("hawk");                    // [hawk, hawk]
        System.out.println(birds_3.isEmpty());     // false
        System.out.println(birds_3.size());     // 2

        // clear();
        List<String> birds_4 = new ArrayList<>();
        birds_4.add("hawk");                        // [hawk]
        birds_4.add("hawk");                        // [hawk, hawk]
        System.out.println(birds_4.isEmpty());      // false
        System.out.println(birds_4.size());         // 2
        birds_4.clear();                            // []
        System.out.println(birds_4.isEmpty());      // true
        System.out.println(birds_4.size());         // 0

        // contains();
        List<String> birds_5 = new ArrayList<>();
        birds_5.add("hawk");                            // [hawk]
        System.out.println(birds_5.contains("hawk"));   // true
        System.out.println(birds_5.contains("robin"));  // false

        // equals()
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two));        // true
        one.add("a");                               // [a]
        System.out.println(one.equals(two));        // false
        two.add("a");                               // [a]
        System.out.println(one.equals(two));        // true
        one.add("b");                               // [a,b]
        two.add(0, "b");                            // [b,a]
        System.out.println(one.equals(two));        // false

        // sorting
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); // [5, 81, 99]

        List<String> strings = new ArrayList<>();
        strings.add("Mike");
        strings.add("Avr1aam");
        strings.add("Avr2aam");
        strings.add("Smith");
        Collections.sort(strings);
        System.out.println(strings); // [Avr1aam, Avr2aam, Mike, Smith]

        // converting to array
        List<String> list1 = new ArrayList<>();
        list1.add("hawk");
        list1.add("robin");
        Object[] objectArray = list1.toArray();
        System.out.println(objectArray.length);     // 2
        // specifies es the type of the array and does what we actually want
        String[] stringArray = list1.toArray(new String[0]);
        System.out.println(stringArray.length);     // 2

        // converting to list
        String[] array = {"hawk", "robin"};         // [hawk, robin]
        List<String> list2 = Arrays.asList(array);  // returns fixed size list
        System.out.println(list2.size());           // 2
        list2.set(1, "test");                       // [hawk, test]
        array[0] = "new";                           // [new, test]

        for (String b : array)
            System.out.println(b + " ");              // new test
        // list2.remove(1);     // throws UnsupportedOperation Exception
        // because we are not allowed to change the size of the list.
        // it happens when array and list point to the same data store.

    }

}
