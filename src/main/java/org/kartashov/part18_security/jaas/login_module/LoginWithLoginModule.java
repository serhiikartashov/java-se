package org.kartashov.part18_security.jaas.login_module;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.security.AccessController;
import java.security.Permission;
import java.security.Principal;
import java.security.PrivilegedAction;
import java.util.logging.Logger;

// -Djava.security.auth.login.config=src/main/resources/login4.config
// -Djava.security.policy=src/main/resources/java2.policy
// throws exxception with access denied for "test" permissions by some unknown reason...
public class LoginWithLoginModule {

    private static final Logger logger = Logger.getLogger(LoginWithLoginModule.class.getName());

    public static void main(String[] args) {
        try {
            LoginContext lc = new LoginContext("MyLoginConfig", new CustomCallbackHandler());
            lc.login();
            // Login succeeded
            logger.info("Authentication successful");

            // Show user info
            Subject subject = lc.getSubject();
            logger.info("User principals:");
            for (Principal ppal : subject.getPrincipals()) {
                logger.info("\t" + ppal.toString());
            }

            // Action with access-control
            PrivilegedAction action = new PrivilegedAction() {
                @Override
                public Object run() {
                    Permission permission = new CustomPermission("test");
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
