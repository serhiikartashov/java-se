package org.kartashov.part18_security.jaas.authorization;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.security.AccessController;
import java.security.Permission;
import java.security.Principal;
import java.security.PrivilegedAction;
import java.util.logging.Logger;

// -Djava.security.auth.login.config=src/main/resources/login3.config
// -Djava.security.policy=src/main/resources/java1.policy
public class LoginWithAuthorization {

    private static final Logger logger = Logger.getLogger(LoginWithAuthorization.class.getName());

    public static void main(String[] args) {
        try {
            LoginContext lc = new LoginContext("MyLoginConfig");
            lc.login();
            // Login succeeded
            logger.info("Authentication successful");

            // Show user info
            Subject subject = lc.getSubject();
            logger.info("User principals:");
            for (Principal ppal : subject.getPrincipals()) {
                logger.info("\t" + ppal.toString());
            }
            logger.info("User public credentials:");
            for (Object pubCred : subject.getPublicCredentials()) {
                logger.info("\t" + pubCred.toString());
            }
            logger.info("User private credentials:");
            for (Object privCred : subject.getPrivateCredentials()) {
                logger.info("\t" + privCred.toString());
            }

            // Action with access-control
            PrivilegedAction action = new PrivilegedAction() {
                @Override
                public Object run() {
                    Permission permission = new MyPermission("test");
                    AccessController.checkPermission(permission);
                    logger.info("Permission is granted");
                    return null;
                }
            };
            Subject.doAsPrivileged(subject, action, null);
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

}
