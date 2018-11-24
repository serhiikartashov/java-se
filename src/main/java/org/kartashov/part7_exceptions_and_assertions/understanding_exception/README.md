                      java.lang.Object
                              |
                              |
                    java.lang.Throwable
                              |
              |                             |
     java.lang.Exception            java.lang.Error
              |
              |
 java.lang.RuntimeException


#Unchecked exceptions - java.lang.RuntimeException

#Checked exceptions - includes Exception and all subclasses 
#that do not extend RuntimeException. 

#Checked exceptions must be handled or declared.


Type                How to recognize    Okay for program    Is program required  
                                        to catch?           to handle or declare?

Runtime exception   Subclass of         Yes                 No 
                    RuntimeException
Checked exception   Subclass of         Yes                 Yes
                    Exception but not 
                    subclass of 
                    RuntimeException
Error               Subclass of Error   No                  No


http://docs.oracle.com/javase/tutorial/essential/exceptions/index.html