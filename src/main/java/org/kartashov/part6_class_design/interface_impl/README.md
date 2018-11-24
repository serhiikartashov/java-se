Rules for creating an interface:

1. Interfaces cannot be instantiated directly.
2. An interface is not required to have any methods.
3. An interface may not be marked as final. 
4. All top-level interfaces are assumed to have public or default access, 
and they must include the abstract modifier in their definition. 
Therefore, marking an interface as private, protected, or final will 
trigger a compiler error, since this is incompatible with these assumptions.
5. All nondefault methods in an interface are assumed to have the 
modifiers abstract and public in their definition. Therefore, 
marking a method as private, protected, or final will trigger 
compiler errors as these are incompatible with the abstract and 
public keywords.

The compiler will convert them both to the second example:
public interface CanFly {  
void fly(int speed);  
abstract void takeoff();  
public abstract double dive(); 
}

public abstract interface CanFly {  
public abstract void fly(int speed);  
public abstract void takeoff();  
public abstract double dive(); 
}

The compiler would also throw an exception if you define an interface 
or abstract class that inherits from two confl icting interfaces, 
as shown here:

public interface Herbivore {  public int eatPlants(); }
public interface Omnivore {  public void eatPlants(); }
public interface Supervore extends Herbivore, Omnivore {} // DOES NOT COMPILE
public abstract class AbstractBear implements Herbivore, Omnivore {}
                                                 // DOES NOT COMPILE
                                                 
Here are two interface variables rules:
1. Interface variables are assumed to be public, static, and final. 
Therefore, marking a variable as private or protected will trigger a 
compiler error, as will marking any variable as abstract. 
2. The value of an interface variable must be set when it is declared 
since it is marked as final.

The compiler will automatically convert them both to the second example:

public interface CanSwim {  
int MAXIMUM_DEPTH = 100;  
final static boolean UNDERWATER = true;  
public static final String TYPE = "Submersible"; 
}

public interface CanSwim {  
public static final int MAXIMUM_DEPTH = 100;  
public static final boolean UNDERWATER = true;  
public static final String TYPE = "Submersible"; 
}

public interface CanDig {  
private int MAXIMUM_DEPTH = 100;  // DOES NOT COMPILE  
protected abstract boolean UNDERWATER = false;  // DOES NOT COMPILE  
public static String TYPE;  // DOES NOT COMPILE 
}

#The following are the default interface method rules:
1. A default method may only be declared within an interface and 
not within a class or abstract class.
 
2. A default method must be marked with the default keyword. 
If a method is marked as default, it must provide a method body. 

3. A default method is not assumed to be static, final, or abstract, 
as it may be used or overridden by a class that implements the interface.

4. Like all methods in an interface, a default method is assumed 
to be public and will not compile if marked as private or protected.

#Here are the static interface method rules: 
1. Like all methods in an interface, a static method is assumed 
to be public and will not compile if marked as private or protected.
 
2. To reference the static method, a reference to the name of the 
interface must be used.
