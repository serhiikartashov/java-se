package org.kartashov.part18_security.jca.signature;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

public class DigitalSignatureUtils {

    private static final String SIGNING_ALG = "SHA256withRSA";
    public static byte[] createDigitalSignature(byte[] input, PrivateKey privateKey) throws Exception {
        Signature signature = Signature.getInstance(SIGNING_ALG);
        signature.initSign(privateKey);
        signature.update(input);
        return signature.sign();
    }

    public static boolean verifyDigitalSignature(byte[] input, byte[] signatureToVerify, PublicKey publicKey) throws Exception {
        Signature signature = Signature.getInstance(SIGNING_ALG);
        signature.initVerify(publicKey);
        signature.update(input);
        return signature.verify(signatureToVerify);
    }
}
