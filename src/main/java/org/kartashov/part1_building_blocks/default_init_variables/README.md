Variables that are not local variables are known as instance variables or class variables (or fields). 

Variable type                               Default initialization value
boolean                                     false
byte, short, int, long                      0 (in the type’s bit-length)
float, double                               0.0 (in the type’s bit-length)
char                                        '\u0000' (NUL)
All object references (everything else)     null


 ■ Local variables—in scope from declaration to end of block 
 ■ Instance variables—in scope from declaration until object garbage collected 
 ■ Class variables—in scope from declaration until program ends