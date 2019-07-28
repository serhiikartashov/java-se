package org.kartashov.part18_security.jca.signature;

import org.junit.jupiter.api.Test;
import org.kartashov.part18_security.jca.hash.HashGenerator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

import static org.junit.jupiter.api.Assertions.*;

class DigitalSignatureUtilsTest {

    @Test
    void digitalSignatureRoutine() throws Exception {
        Path path1 = Paths.get("data/security/demo.txt");
        byte[] input = Files.readAllBytes(path1);

        KeyPairGenerator keyGen1 = KeyPairGenerator.getInstance("RSA");
        keyGen1.initialize(4096);
        KeyPair rsaKeyPair = keyGen1.generateKeyPair();

        byte[] signature = DigitalSignatureUtils.createDigitalSignature(input, rsaKeyPair.getPrivate());
        System.out.println(HashGenerator.convertToHexString(signature));
        assertTrue(DigitalSignatureUtils.verifyDigitalSignature(input, signature, rsaKeyPair.getPublic()));
    }

}