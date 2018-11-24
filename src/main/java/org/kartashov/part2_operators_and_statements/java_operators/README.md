            Order of operator precedence

Operator                            Symbols and examples
Post-unary operators                expression++, expression--
Pre-unary operators                 ++expression, --expression
Other unary operators               +, -, !
Multiplication/Division/Modulus     *, /, %
Addition/Subtraction                +,- 
Shift operators                     <<, >>, >>>
Relational operators                <, >, <=, >=, instanceof
Equal to/not equal to               ==, !=
Logical operators                   &, ^, |
Short-circuit logical operators     &&, ||
Ternary operators                   boolean expression ? expression1 : expression2
Assignment operators                =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=


All of the arithmetic operators may be applied to any Java primitives, 
except boolean and String. Furthermore, only the addition operators + and += 
may be applied to String values, which results in String concatenation. 

 When you use the equality operator ( == ) with booleans, if exactly one 
 of the operands is a Boolean wrapper, it is first unboxed into a boolean primitive 
 and then the two are compared (JLS 15.21.2). If both are Boolean wrappers, 
 then their references are compared just like in the case of other objects. 
 Thus, new Boolean("true") == new Boolean("true") is false, 
 but new Boolean("true") == Boolean.parseBoolean("true") is true.
 
 
 
~ (bitwise compliment)
Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.

 a = 0011 1100
 b = 0000 1101
 ~a  = 1100 0011
 
 >>> (zero fill right shift)
 Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.
 
 Example: A >>>2 will give 15 which is 0000 1111
 
 
 http://www.tutorialspoint.com/java/java_basic_operators.htm