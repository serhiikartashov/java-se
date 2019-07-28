package org.kartashov.part18_security.jaas.authentification;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.security.PrivilegedAction;

// run with parameter
// -Djava.security.auth.login1.config=src/main/resources/login1.config
public class LoginContextExample {

    public static void main(String[] args) throws LoginException {
        LoginContext lc = new LoginContext("MyLoginContext");
        lc.login();

//        // now try to execute the SampleAction as the authenticated Subject
//        Subject mySubject = lc.getSubject();
//        PrivilegedAction action = new SampleAction();
//        Subject.doAsPrivileged(mySubject, action, null);
    }
}
