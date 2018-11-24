Each class has a copy of the instance variables. There is only one copy 
of the code for the instance methods. Each instance of the class can call 
it as many times as it would like. However, each call of an instance 
method (or any method) gets space on the stack for method parameters 
and local variables.

The same thing happens for static methods. There is one copy of the code. 
Parameters and local variables go on the stack.

Just remember that only data gets its “own copy.” There is no need 
to duplicate copies of the code itself.

Type                Calling                             Legal?  How?
Static method       Another static method or variable   Yes     Using the classname
Static method       An instance method or variable      No
Instance method     A static method or variable         Yes     Using the classname or a reference variable
Instance method     Another instance method or variable Yes     Using a reference variable

