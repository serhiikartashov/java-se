package org.kartashov.part18_security.jaas.login_module.module;

import javax.security.auth.Subject;
import javax.security.auth.callback.*;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomLoginModule implements LoginModule {

    private static final Logger logger = Logger.getLogger(CustomLoginModule.class.getName());

    // LoginModule header
    private static final String HEADER = "### CustomLoginModule (v0.1, 2013-07-21) ###";

    // Initial state
    private Subject subject;
    private CallbackHandler callbackHandler;

    // Options
    private boolean moduleBanner = false;
    private boolean debug = false;

    // Authentication status
    private boolean succeeded = false;
    private boolean commitSucceeded = false;
    private String username;
    private char[] password;
    private CustomPrincipal principal;


    @Override
    public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {
        // Check parameters
        if (subject==null)
            throw new IllegalArgumentException("Cannot login without a Subject");
        if (callbackHandler==null)
            throw new IllegalArgumentException("Cannot login without a CallbackHandler");

        // Store parameters
        this.subject = subject;
        this.callbackHandler = callbackHandler;

        // Read options
        moduleBanner = getOption(options, "moduleBanner");
        debug = getOption(options, "debug");

        // Displays the options
        if (debug) {
            System.out.print("OPTIONS: ");
            if (moduleBanner)     System.out.print("moduleBanner ");
            System.out.println("debug");
        }
    }
    private boolean getOption(Map<String, ?> options, String option) {
        if (options != null && options.containsKey(option))
            return "true".equalsIgnoreCase((String) options.get(option));
        return false;
    }

    @Override
    public boolean login() throws LoginException {
        if (debug)  System.out.println("Executing LOGIN");
        try {
            // Prepare callbacks (we could also send custom callbacks...)
            Callback[] cbs;
            NameCallback ncb = new NameCallback("Username: ");
            PasswordCallback pwcb = new PasswordCallback("Password: ", false);
            // Send a banner if asked to
            if (moduleBanner) {
                cbs = new Callback[3];
                cbs[0] = new TextOutputCallback(TextOutputCallback.INFORMATION, HEADER);
                cbs[1] = ncb;
                cbs[2] = pwcb;
            }
            else {
                cbs = new Callback[2];
                cbs[0] = ncb;
                cbs[1] = pwcb;
            }

            // Handle the callbacks
            callbackHandler.handle(cbs);

            // Get the name and password
            username = ncb.getName();
            password = pwcb.getPassword();

            // Do authentication
            if (debug)  System.out.println("Performing authentication with login/password");
            succeeded = doAuth(username, password);
            // If authentication succeeded
            if (succeeded) {
                if (debug)  System.out.println("Authentication SUCEEDED with login/password");
                return true;
            }
            // If authentication failed
            else {
                if (debug)  System.out.println("Authentication FAILED with login/password");
                throw new FailedLoginException("Login failed with login and password");
            }
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Cannot acquire user's name or password : i/o error", ex);
            throw new FailedLoginException("Login failed because of I/O error");
        } catch (UnsupportedCallbackException ex) {
            logger.log(Level.SEVERE, "Cannot acquire user's name or password : unsupported", ex);
            throw new FailedLoginException("Login failed because of an unsupported Callback");
        }
    }
    /**
     * Authentication succeeds if username and password are equal.
     */
    private boolean doAuth(String username, char[] password) {
        return new String(password).equals(username);
    }

    @Override
    public boolean commit() throws LoginException {
        // If 'login' failed, destroy the state
        if (succeeded == false) {
            if (debug)  System.out.println("Executing COMMIT on failed authentication");
            destroy();
            return false;
        }
        // If 'login' succeeded
        else {
            if (debug)  System.out.println("Executing COMMIT on successful authentication");
            // If subject is read-only : can't add the principal
            if (subject.isReadOnly()) {
                commitSucceeded = false;
                throw new LoginException("Commit failed because the Subject is read-only");
            }
            // Add a Principal to the Subject
            principal = new CustomPrincipal(username);
            subject.getPrincipals().add(principal);
            // Clear login/pwd
            username = null;
            password = null;
            // Commit was successful
            commitSucceeded = true;
            return true;
        }
    }
    private void destroy() {
        succeeded = false;
        commitSucceeded = false;
        username = null;
        password = null;
    }

    @Override
    public boolean abort() throws LoginException {
        // If 'login' failed
        if (succeeded == false) {
            if (debug)  System.out.println("Executing ABORT on failed authentication");
            destroy();
            return false;
        }
        // If 'login' succeeded, clear state
        else {
            if (debug)  System.out.println("Executing ABORT on successful authentication");
            destroy();
            return true;
        }
    }

    @Override
    public boolean logout() throws LoginException {
        if (debug)  System.out.println("Executing LOGOUT");
        // If subject is read-only, can't remove principals
        if (!subject.isReadOnly())
            subject.getPrincipals().remove(principal);
        return true;
    }

}
