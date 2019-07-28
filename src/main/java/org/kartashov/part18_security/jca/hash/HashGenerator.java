package org.kartashov.part18_security.jca.hash;

import org.mindrot.jbcrypt.BCrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {


    public static String createHash(String input, String salt) {
        try {
            String valueToHash = input + salt;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(valueToHash.getBytes());
            return convertToHexString(hash);
        } catch (NoSuchAlgorithmException nsae) {
            throw new CryptoUtilsSystemException("Algorithm not available.");
        }
    }

    public static String createPasswordHash(String password) {
        String result = BCrypt.hashpw(password, BCrypt.gensalt(11));
        return result;
    }

    public static boolean validatePasswordHash(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }

    public static String convertToHexString(byte[] hash) {
        //Converting the byte array in to HexString format
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < hash.length; i++) {
            result.append(Integer.toHexString(0xFF & hash[i]));
        }
        return result.toString();
    }
}
class CryptoUtilsSystemException extends RuntimeException {
    public CryptoUtilsSystemException() {
    }

    public CryptoUtilsSystemException(String message) {
        super(message);
    }

    public CryptoUtilsSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public CryptoUtilsSystemException(Throwable cause) {
        super(cause);
    }
}