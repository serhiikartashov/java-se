Unary operator      Description
+                   Indicates a number is positive, although numbers are assumed to be positive in Java unless accompanied by a negative unary operator
-                   Indicates a literal number is negative or negates an expression
++                  Increments a value by 1
--                  Decrements a value by 1
!                   Inverts a Boolean’s logical value

int x = !5;  // DOES NOT COMPILE 
boolean y = -true;  // DOES NOT COMPILE 
boolean z = !0;  // DOES NOT COMPIL


int counter = 0; 
System.out.println(counter);  // Outputs 0 
System.out.println(++counter);  // Outputs 1 
System.out.println(counter); // Outputs 1 
System.out.println(counter--);  // Outputs 1 
System.out.println(counter);  // Outputs 0