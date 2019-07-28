package org.kartashov.part18_security.jaas.authentification;

import javax.security.auth.callback.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class MyCallbackHandler implements CallbackHandler {

    private static final Logger logger = Logger.getLogger(MyCallbackHandler.class.getName());

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback cb : callbacks) {
            //logger.info("Callback received: " + cb.getClass().getCanonicalName());
            if (cb instanceof TextOutputCallback) {
                TextOutputCallback tocb = (TextOutputCallback) cb;
                // Different display for each message type
                switch (tocb.getMessageType()) {
                    case TextOutputCallback.INFORMATION:
                        logger.info(tocb.getMessage());
                        break;
                    case TextOutputCallback.WARNING:
                        logger.warning(tocb.getMessage());
                        break;
                    case TextOutputCallback.ERROR:
                        logger.severe(tocb.getMessage());
                        break;
                    // Unknown type
                    default:
                        throw new IOException("Unknown message type: " + tocb.getMessage());
                }
            }
            else if (cb instanceof NameCallback) {
                NameCallback ncb = (NameCallback) cb;
                // Display prompt
                System.out.print(ncb.getPrompt());
                // Read name
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                ncb.setName(br.readLine());
            }
            else if (cb instanceof PasswordCallback) {
                PasswordCallback pwcb = (PasswordCallback) cb;
                // Display prompt
                System.out.print(pwcb.getPrompt());
                // Read password
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                pwcb.setPassword(br.readLine().toCharArray());
            }
            else if (cb instanceof ConfirmationCallback) {
                ConfirmationCallback ccb = (ConfirmationCallback) cb;
                ccb.setSelectedIndex(ccb.getDefaultOption());
            }
            // Other unsupported callbacks
            else {
                throw new UnsupportedCallbackException(cb, "Callback '" + cb + "' is not supported");
            }
        }
    }

}
