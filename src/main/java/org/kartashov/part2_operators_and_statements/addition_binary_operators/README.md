short x = 10; 
short y = 3; 
short z = (short)(x * y);

int x = 2, z = 3; 
x = x * z;  // Simple assignment operator 
x *= z;  // Compound assignment operator

if x was not already defined, then the expression x *= z would not compile

Relation Operators
<   Strictly less than
<=  Less than or equal to
>   Strictly greater than
>=  Greater than or equal to

a instanceof b

Logical Operators
&, |, ^

Here are some tips to help remember this table: 
■ AND is only true if both operands are true. 
■ Inclusive OR is only false if both operands are false. 
■ Exclusive OR is only true if the operands are different

Conditional Operators
&&, ||

if(x != null && x.getValue() < 5) {  // Do something }

In this example, if x was null, then the short-circuit prevents a NullPointerException 
from ever being thrown, since the evaluation of x.getValue() < 5 is never reached. 

Alternatively, if we used a logical &, then both sides would always be evaluated 
and when x was null this would throw an exception:

if(x != null & x.getValue() < 5) { // Throws an exception if x is null  // Do something }

