package org.kartashov.part18_security.jca.encryption;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.security.*;
import java.security.spec.AlgorithmParameterSpec;

public class InitializationVectorsExample {

    private static final int TAG_LENGTH_BIT = 128;
    private static final int IV_LENGTH_BYTE = 12;

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {
        Cipher c = Cipher.getInstance("AES/GCM/PKCS5Padding");
        // Symmetric Encryption
        KeyGenerator keyGen2 = KeyGenerator.getInstance("AES");
        keyGen2.init(256);
        SecretKey aesKey = keyGen2.generateKey();

        // INITIALIZATION VECTORS

        // 1. Only relevant for Symmetric Encryption
        // 2. Only time you need to get into transparent specification

        byte[] iv = new byte[IV_LENGTH_BYTE];

        // Algorithm initialization
        AlgorithmParameterSpec gcmParamSpec = new GCMParameterSpec(TAG_LENGTH_BIT, iv);
        // randomness doesn't come from this
        c.init(Cipher.ENCRYPT_MODE,
                aesKey,
                gcmParamSpec,
                new SecureRandom());
    }
}
