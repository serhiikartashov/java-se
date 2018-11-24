#Concatenation
There aren’t a lot of rules to know for this, but you have to know them well: 
1. If both operands are numeric, + means numeric addition. 
2. If either operand is a String, + means concatenation. 
3. The expression is evaluated left to right.

#String is immutable! an object that can't be changed once it's created.

#Immutable classes in Java are final, and subclasses can’t add mutable behavior.

#String Literal Pool
Java realizes that many strings repeat in the program and solves this issue 
by reusing common ones. The string pool, also known as the intern pool, 
is a location in the Java virtual machine (JVM) that collects all these strings.
 
Strings, even though they are immutable, are still objects like any other in Java. 
Objects are created on the heap and Strings are no exception. 
So, Strings that are part of the "String Literal Pool" still live on the heap, 
but they have references to them from the String Literal Pool.

String one = "someString";
String two = "someString";

System.out.println(one.equals(two));
System.out.println(one == two);

// output
true
true

While the equals() method checks to see if the String objects contain the same data 
("someString"), the == operator, when used on objects, checks for referential 
equality - that means that it will return true if and only if the two reference 
variables refer to the exact same object. In such a case, the references are equal. 
From the above output, you can see that the local variables, one and two, 
not only refer to Strings that contain the same data, they refer to the same object.

 
You can find more details [here](http://www.javaranch.com/journal/200409/ScjpTipLine-StringsLiterally.html).

 * Equivalent String Literals (even those stored in separate classes in separate packages) will refer to the same String object.
 * In general, String Literals are not eligible for garbage collection. Ever.
 * Strings created at run-time will always be distinct from those created from String Literals.
 * You can reuse String Literals with run-time Strings by utilizing the intern() method.
 * The best way to check for String equality is to use the equals() method.

#StringBuffer does the same thing but more slowly because it is thread safe!

 