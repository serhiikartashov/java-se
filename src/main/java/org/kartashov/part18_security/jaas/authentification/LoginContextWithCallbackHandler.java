package org.kartashov.part18_security.jaas.authentification;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.util.logging.Logger;

// -Djava.security.auth.login.config=src/main/resources/login3.config
public class LoginContextWithCallbackHandler {

    private static final Logger logger = Logger.getLogger(LoginContextWithCallbackHandler.class.getName());

    public static void main(String[] args) {
        try {
            LoginContext lc = new LoginContext("MyLoginConfig", new MyCallbackHandler());
            lc.login();
            // Login succeeded
            logger.info("Authentication successful");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

}
