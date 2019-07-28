package org.kartashov.part18_security.jca.keystore;

import org.junit.jupiter.api.Test;
import org.kartashov.part18_security.jca.hash.HashGenerator;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyStore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class KeyStoreUtilsTest {

    @Test
    void createPrivateKeyJavaKeyStore() throws Exception {
        KeyGenerator keyGen2 = KeyGenerator.getInstance("AES");
        keyGen2.init(256);
        SecretKey aesKey = keyGen2.generateKey();

        String secretKeyHex = HashGenerator.convertToHexString(aesKey.getEncoded());
        KeyStore keyStore = KeyStoreUtils.createPrivateKeyJavaKeyStore("password", "foo", aesKey, "keyPassword");
        assertNotNull(keyStore);

        keyStore.load(null, "password".toCharArray());
        KeyStore.ProtectionParameter entryPassword = new KeyStore.PasswordProtection("keyPassword".toCharArray());
        KeyStore.SecretKeyEntry resultEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry("foo", entryPassword);
        SecretKey result = resultEntry.getSecretKey();
        String resultKeyHex = HashGenerator.convertToHexString(result.getEncoded());
        assertEquals(secretKeyHex, resultKeyHex);
    }
}
