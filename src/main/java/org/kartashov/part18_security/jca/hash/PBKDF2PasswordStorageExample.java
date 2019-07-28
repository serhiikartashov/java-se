package org.kartashov.part18_security.jca.hash;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;

public class PBKDF2PasswordStorageExample {

    private static final String PDKDF2_ALGORITHM = "PBKDF2WithHmacSHA512";

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // 1. password
        // 2. salt - CSPRNG salt > 64
        // Iterate Algo > 10,000
        // key length >=256
        PBEKeySpec keySpec = new PBEKeySpec(
                "password".toCharArray(),
                "salt".getBytes(),
                10_0000,
                256
        );

        // approved hmac
        SecretKeyFactory pbkdfKey = SecretKeyFactory.getInstance(PDKDF2_ALGORITHM);
    }
}
