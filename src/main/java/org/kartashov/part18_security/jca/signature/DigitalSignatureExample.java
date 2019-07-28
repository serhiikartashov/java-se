package org.kartashov.part18_security.jca.signature;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.*;

public class DigitalSignatureExample {

    public static void main(String[] args) throws NoSuchProviderException, NoSuchAlgorithmException, SignatureException {
        Signature signGen = Signature.getInstance("SHA256withRSAandMGF1", BouncyCastleProvider.PROVIDER_NAME);

        // Signer
//        signGen.initSign(privateKey);
//        signGen.update(checksum);
        byte[] signature = signGen.sign();

        // Verifier
//        signGen.initSign(privateKey);
//        signGen.update(checksum);
        signGen.verify(signature);
    }
}
