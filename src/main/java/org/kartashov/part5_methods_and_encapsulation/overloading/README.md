#Method overloading 
occurs when there are different method signatures with the same name 
but different type parameters

#Autoboxing

public void fly(int numMiles) { } 
public void fly(Integer numMiles) { }

Rule                    Example of what will be chosen for glide(1,2)
Exact match by type     public String glide(int i, int j) {} 
Larger primitive type   public String glide(long i, long j) {} 
Autoboxed type          public String glide(Integer i, Integer j) {} 
Varargs                 public String glide(int... nums) {}

