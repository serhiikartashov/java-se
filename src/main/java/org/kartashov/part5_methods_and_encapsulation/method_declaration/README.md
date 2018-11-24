#Access Modifiers
public                      The method can be called from any class. 
private                     The method can only be called from within 
                            the same class. 
protected                   The method can only be called from classes 
                            in the same package or subclasses.  
Default (Package Private)   Access The method can only be called from 
                            classes in the same package. This one is 
                            tricky because there is no keyword for 
                            default access. You simply omit the access modifier.

#Optional Specifiers
static          Covered later in this chapter. Used for class methods. 
abstract        Covered in Chapter 5. Used when not providing a method body. 
final           Covered in Chapter 5. Used when a method is not allowed 
                to be overridden by a subclass. 
synchronized    On the OCP but not the OCA exam. 
native          Not on the OCA or OCP exam. Used when interacting 
                with code written in another language such as C++. 
strictfp        Not on the OCA or OCP exam. Used for making floating-point 
                calculations portable. 

public void walk1() {} 
public final void walk2() {} 
public static final void walk3() {} 
public final static void walk4() {} 
public modifier void walk5() {} // DOES NOT COMPILE 
public void final walk6() {} // DOES NOT COMPILE 
final public void walk7() {}

#Method name
Identifier may only contain letters, numbers, $, or _

public void walk1() { } 
public void 2walk() { } // DOES NOT COMPILE 
public walk3 void() { } // DOES NOT COMPILE 
public void Walk_$() { } 
public void() { } // DOES NOT COMPILE

#Parameter List
Although the parameter list is required, it doesn’t have to contain any parameters.

public void walk1() { } 
public void walk2 { } // DOES NOT COMPILE 
public void walk3(int a) { } 
public void walk4(int a; int b) { }  // DOES NOT COMPILE 
public void walk5(int a, int b) { }

#Optional Exception List

public void zeroExceptions() { } 
public void oneException() throws IllegalArgumentException { } 
public void twoExceptions() throws   
    IllegalArgumentException, InterruptedException { }

#Method body

public void walk1() { } 
public void walk2; // DOES NOT COMPILE 
public void walk3(int a) { int name = 5; }

#Varargs

It allowed to have one vararg parameter per method 
and it must be the last element int a method's parameter list.  