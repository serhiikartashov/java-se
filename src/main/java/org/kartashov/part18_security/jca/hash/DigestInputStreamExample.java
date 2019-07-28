package org.kartashov.part18_security.jca.hash;

import java.io.File;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class DigestInputStreamExample {

    public static String digest(String file) {
        if (!new File(file).exists()) return null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            DigestInputStream dis = new DigestInputStream(new FileInputStream(file), md5);
            byte buf[] = new byte[8 * 1024];
            while (dis.read(buf, 0, buf.length) > 0) ;
            dis.close();
            return String.format("%032x", new java.math.BigInteger(1, md5.digest()));
        } catch (Exception e) {
            throw new RuntimeException("failed to calculate MD5 checksum of " + file, e);
        }
    }

    public static void main(String[] args) {
        System.out.println(digest("README.md"));
    }

}
