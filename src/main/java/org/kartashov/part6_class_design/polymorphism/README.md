#We can summarize this principle with the following two rules:
1. The type of the object determines which properties exist within 
the object in memory. 
2. The type of the reference to the object determines which methods 
and variables are accessible to the Java program.

#Basic rules for casting variables:
1. Casting an object from a subclass to a superclass doesn’t require 
an explicit cast. 
2. Casting an object from a superclass to a subclass requires an 
explicit cast. 
3. The compiler will not allow casts to unrelated types. 
4. Even when the code compiles without issue, an exception may be 
thrown at runtime if the object being cast is not actually an 
instance of that class.

#virtual method
 is a method in which the specific implementation 
 is not determined until runtime.
