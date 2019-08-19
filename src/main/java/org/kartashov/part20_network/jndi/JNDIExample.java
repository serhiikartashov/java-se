package org.kartashov.part20_network.jndi;

import javax.naming.*;
import java.io.File;
import java.util.Properties;

public class JNDIExample {
    public static void main(String[] args) throws NamingException {
        String name = new File("io/data/test1.txt").getAbsolutePath();
//        String name  = new File("io/data").getAbsolutePath();

        Properties properties = new Properties();
        properties.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
        properties.put(Context.PROVIDER_URL, "file:///");

        Context initialContext = new InitialContext(properties);

        File obj = (File) initialContext.lookup(name);
        System.out.println(obj.getName());
        System.out.println(name + " is bound to: " + obj);



        String dirName = new File("io/data").getAbsolutePath();
        NamingEnumeration list = initialContext.list(dirName);

        while (list.hasMore()) {
            NameClassPair nc = (NameClassPair) list.next();
            System.out.println(nc);
        }

        String dirName2 = new File("io").getAbsolutePath();
        NamingEnumeration list2 = initialContext.listBindings(dirName2);

        while (list2.hasMore()) {
            Binding nc = (Binding) list.next();
            System.out.println(nc);
        }

    }
}
