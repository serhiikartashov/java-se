package org.kartashov.part18_security.jca.encryption;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

// Cryptographically secure pseudorandom number generator (CSPRNG)
public class CSPRNG {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        SecureRandom secRandom = new SecureRandom();
        // self-seeded
        byte[] rawBytes = new byte[0];
        secRandom.nextBytes(rawBytes);

        // OS-dependent, most secured way
        // Windows
        // default: SHA1PRNG (don't use)
        SecureRandom secureRandom1 = SecureRandom.getInstance("Windows-PRNG");
        // Unix-like
        // default: NativePRNG
        // SecureRandom secureRandom2 = SecureRandom.getInstance();
    }
}
