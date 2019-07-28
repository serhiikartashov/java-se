package org.kartashov.part18_security.jca.encryption;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

public class CipherExample {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException {
        // algorithm/mode/padding_scheme
        // Asymetric Encryption
        Cipher cAsym = Cipher.getInstance("RAS/ESB/OAEPWITHSHA-512ANDMGF1PADDING");
        // Symmetric Encryption
        Cipher cSymm = Cipher.getInstance("AES/GCM/PKCS5Padding");
    }
}
