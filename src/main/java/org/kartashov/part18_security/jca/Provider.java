package org.kartashov.part18_security.jca;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;

public class Provider {

    public static void main(String[] args) {
        // adding security provider
        // java -Djava.security.debug="provider=SUN" SecuredRSAUsage
//        Security.addProvider(new SunJSSE());
        Security.addProvider(new BouncyCastleProvider());

        for (java.security.Provider provider : Security.getProviders()) {
            System.out.println("Provider: " + provider.getName());
            for (java.security.Provider.Service service : provider.getServices()) {
                System.out.println("  Algorithm: " + service.getAlgorithm());
            }
        }
    }
}
