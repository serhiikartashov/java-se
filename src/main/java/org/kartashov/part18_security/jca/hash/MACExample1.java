package org.kartashov.part18_security.jca.hash;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

// Message Authentication Code
public class MACExample1 {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
        // approved hash function
        KeyGenerator kg = KeyGenerator.getInstance("HmacSHA256");
        SecretKey key = kg.generateKey();
        // Mac Engine configured
        Mac mac = Mac.getInstance(key.getAlgorithm());
        mac.init(key);
        // data bundled & MAC computed
        String message = "Message";
        mac.update(message.getBytes());
        byte[] macTag = mac.doFinal();

        System.out.println(macTag);
    }
}
