package org.kartashov.part18_security.jca.hash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestAuth {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String userName = "vivek";
        String realm = "Pentester-Academy";
        String password = "pentesteracademy";

        String method = "GET";
        String uri = "/";

        String nonce = "cmMXCA/nBAA=7002cad884ece9b87dd63d4a0aa7f3b1cf9f731b";
        String nonceCount = "00000001";
        String clientNonce = "c6470d4d075843c9";
        String qop = "auth";

        MessageDigest digest = MessageDigest.getInstance("MD5");
        digest.update((userName + ":" + realm + ":" + password).getBytes());
        byte[] hash1Binary = digest.digest();
        String hash1 = convertToHex(hash1Binary);
        System.out.println("Hash1 : " + hash1);

        digest.update((method + ":" + uri).getBytes());
        byte[] hash2Binary = digest.digest();
        String hash2 = convertToHex(hash2Binary);
        System.out.println("Hash2 : " + hash2);

        digest.update((hash1 + ":" + nonce + ":" + nonceCount + ":" + clientNonce + ":" + qop + ":" + hash2).getBytes());
        byte[] hash3Binary = digest.digest();
        String hash3 = convertToHex(hash3Binary);
        System.out.println("Response : " + hash3);
    }

    private static String convertToHex(byte[] hash) {

        //Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();

        // variant 1
        for (int i = 0; i < hash.length; i++) {
            hexString.append(Integer.toHexString(0xFF & hash[i]));
        }

        // variant 2
        // Convert byte array into signum representation
        BigInteger no = new BigInteger(1, hash);
        // Convert message digest into hex value
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }



        // variant 3
//        for(int i=0; i< hash.length ;i++)
//        {
//            hexString.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
//        }
        return hashtext;
//        return hexString.toString();
    }
}
