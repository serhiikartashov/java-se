
print(() -> true);                                       // 0 parameters 
print(a -> a.startsWith("test"));                        // 1 parameter 
print((String a) -> a.startsWith("test"));               // 1 parameter 
print((a, b) -> a.startsWith("test"));                   // 2 parameters 
print((String a, String b) -> a.startsWith("test"));     // 2 parameters


print(a, b -> a.startsWith("test"));            // DOES NOT COMPILE 
print(a -> { a.startsWith("test"); });          // DOES NOT COMPILE 
print(a -> { return a.startsWith("test") });    // DOES NOT COMPILE

The fi rst line needs parentheses around the parameter list. 
Remember that the parentheses are only optional when there is one 
parameter and it doesn’t have a type declared. The second line is 
missing the return keyword. The last line is missing the semicolon. 

You might have noticed all of our lambdas return a boolean. 
That is because the scope for the OCA exam limits what you need to learn.

Java doesn’t allow us to redeclare a local variable
(a, b) -> { int a = 0; return 5;}     // DOES NOT COMPILE

following line is okay because it uses a different variable name
(a, b) -> { int c = 0; return 5;}