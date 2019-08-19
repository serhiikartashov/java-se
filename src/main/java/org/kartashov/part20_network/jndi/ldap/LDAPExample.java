package org.kartashov.part20_network.jndi.ldap;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

public class LDAPExample {

    public static void main(String[] args) throws NamingException {
        // Set up the environment for creating the initial context
        Hashtable<String, Object> env = new Hashtable<String, Object>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");

        // Specify LDAPS URL
        env.put(Context.PROVIDER_URL, "ldaps://localhost:10389");

        // Authenticate as S. User and password "secret_new"
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL,
                "uid=admin,ou=system");
        env.put(Context.SECURITY_CREDENTIALS, "secret_new");

        // Create the initial context
        DirContext ctx = new InitialDirContext(env);



    }
}
