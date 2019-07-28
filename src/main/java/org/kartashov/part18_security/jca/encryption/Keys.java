package org.kartashov.part18_security.jca.encryption;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class Keys {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Asymmetric Encryption
        KeyPairGenerator keyGen1 = KeyPairGenerator.getInstance("RSA");
        keyGen1.initialize(4096);
        KeyPair rsaKeyPair = keyGen1.generateKeyPair();
        // Symmetric Encryption
        KeyGenerator keyGen2 = KeyGenerator.getInstance("AES");
        keyGen2.init(256);
        SecretKey aesKey = keyGen2.generateKey();

        System.out.println();
    }
}
