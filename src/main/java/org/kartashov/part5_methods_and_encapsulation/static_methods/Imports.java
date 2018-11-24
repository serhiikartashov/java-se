package org.kartashov.part5_methods_and_encapsulation.static_methods;

//import static java.util.Arrays; // DOES NOT COMPILE
import java.util.List;

import static java.util.Arrays.asList;
//static import java.util.Arrays.*;  // DOES NOT COMPILE

// The compiler will complain if you try to explicitly
// do a static import of two methods with the same name
// or two static variables with the same name
// import static statics.A.TYPE;
// import static statics.B.TYPE;     // DOES NOT COMPILE


/**
 * Created by Serhii K. on 10/19/2015.
 */
public class Imports {

    public static void main(String[] args) {
        List<String> list = asList("one", "two");
        //List<String> list = Arrays.asList("one", "two");
    }
}
