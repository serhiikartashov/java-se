package org.kartashov.part18_security.pgp;

import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openpgp.*;
import org.bouncycastle.openpgp.jcajce.JcaPGPObjectFactory;
import org.bouncycastle.openpgp.operator.PublicKeyDataDecryptorFactory;
import org.bouncycastle.openpgp.operator.jcajce.JcaPGPKeyPair;
import org.bouncycastle.openpgp.operator.jcajce.JcePGPDataEncryptorBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcePublicKeyDataDecryptorFactoryBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcePublicKeyKeyEncryptionMethodGenerator;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.Streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.util.Date;

public class PGPEncryptionExampleForSO
{
    /**
     * Create an encrypted data blob using an AES-256 session key and the
     * passed in public key.
     *
     * @param encryptionKey the public key to use.
     * @param data the data to be encrypted.
     * @return a PGP binary encoded version of the encrypted data.
     */
    public static byte[] createEncryptedData(
            PGPPublicKey encryptionKey,
            byte[] data)
            throws PGPException, IOException
    {
        PGPEncryptedDataGenerator encGen = new PGPEncryptedDataGenerator(
                new JcePGPDataEncryptorBuilder(SymmetricKeyAlgorithmTags.AES_256)
                        .setWithIntegrityPacket(true)
                        .setSecureRandom(new SecureRandom()).setProvider("BC"));
        encGen.addMethod(
                new JcePublicKeyKeyEncryptionMethodGenerator(encryptionKey)
                        .setProvider("BC"));
        ByteArrayOutputStream encOut = new ByteArrayOutputStream();
        // create an indefinite length encrypted stream
        OutputStream cOut = encGen.open(encOut, new byte[4096]);
        // write out the literal data
        PGPLiteralDataGenerator lData = new PGPLiteralDataGenerator();
        OutputStream pOut = lData.open(
                cOut, PGPLiteralData.BINARY,
                PGPLiteralData.CONSOLE, data.length, new Date());
        pOut.write(data);
        pOut.close();
        // finish the encryption
        cOut.close();
        return encOut.toByteArray();
    }

    /**
     * Extract the plain text data from the passed in encoding of PGP
     * encrypted data. The routine assumes the passed in private key
     * is the one that matches the first encrypted data object in the
     * encoding.
     *
     * @param privateKey the private key to decrypt the session key with.
     * @param pgpEncryptedData the encoding of the PGP encrypted data.
     * @return a byte array containing the decrypted data.
     */
    public static byte[] extractPlainTextData(
            PGPPrivateKey privateKey,
            byte[] pgpEncryptedData)
            throws PGPException, IOException
    {
        PGPObjectFactory pgpFact = new JcaPGPObjectFactory(pgpEncryptedData);
        PGPEncryptedDataList encList = (PGPEncryptedDataList)pgpFact.nextObject();
        // find the matching public key encrypted data packet.
        PGPPublicKeyEncryptedData encData = null;
        for (Object pgpEnc: encList)
        {
            PGPPublicKeyEncryptedData pkEnc
                    = (PGPPublicKeyEncryptedData)pgpEnc;
            if (pkEnc.getKeyID() == privateKey.getKeyID())
            {
                encData = pkEnc;
                break;
            }
        }
        if (encData == null)
        {
            throw new IllegalStateException("matching encrypted data not found");
        }
        // build decryptor factory
        PublicKeyDataDecryptorFactory dataDecryptorFactory =
                new JcePublicKeyDataDecryptorFactoryBuilder()
                        .setProvider("BC")
                        .build(privateKey);
        InputStream clear = encData.getDataStream(dataDecryptorFactory);
        byte[] literalData = Streams.readAll(clear);
        clear.close();
        // check data decrypts okay
        if (encData.verify())
        {
            // parse out literal data
            PGPObjectFactory litFact = new JcaPGPObjectFactory(literalData);
            PGPLiteralData litData = (PGPLiteralData)litFact.nextObject();
            byte[] data = Streams.readAll(litData.getInputStream());
            return data;
        }
        throw new IllegalStateException("modification check failed");
    }

    private static void elgamalExample()
            throws Exception
    {
        byte[] msg = Strings.toByteArray("Hello, world!");
        KeyPairGenerator kpGen = KeyPairGenerator.getInstance("DH", "BC");
        kpGen.initialize(2048);
        KeyPair kp = kpGen.generateKeyPair();
        PGPKeyPair elgKp = new JcaPGPKeyPair(
                PGPPublicKey.ELGAMAL_ENCRYPT, kp, new Date());
        byte[] encData = createEncryptedData(elgKp.getPublicKey(), msg);
        byte[] decData = extractPlainTextData(elgKp.getPrivateKey(), encData);
        System.out.println("elgamal encryption msg length: " + msg.length + " enc.length: " + encData.length + " dec.length: " + decData.length);
        System.out.println(Strings.fromByteArray(decData));
    }

    private static void ecExample()
            throws Exception
    {
        byte[] msg = Strings.toByteArray("Hello, world!");
        KeyPairGenerator kpGen = KeyPairGenerator.getInstance("EC", "BC");
        kpGen.initialize(new ECGenParameterSpec("P-256"));
        KeyPair kp = kpGen.generateKeyPair();
        PGPKeyPair ecdhKp = new JcaPGPKeyPair(PGPPublicKey.ECDH, kp, new Date());
        byte[] encData = createEncryptedData(ecdhKp.getPublicKey(), msg);
        // save encrypted string
        Files.write(Paths.get("pgp-encrypted-string.dat"), encData);
        // load encrypted string
        byte[] encDataLoad = Files.readAllBytes(Paths.get("pgp-encrypted-string.dat"));
        byte[] decData = extractPlainTextData(ecdhKp.getPrivateKey(), encDataLoad);
        System.out.println("ec encryption msg length: " + msg.length + " enc.length: " + encData.length + " dec.length: " + decData.length);
        System.out.println(Strings.fromByteArray(decData));
    }

    public static void main(String[] args)
            throws Exception
    {
        Security.addProvider(new BouncyCastleProvider());
        // you need the two files bcpg-jdk15on-165.jar and bcprov-jdk15to18-165.jar to run the example
        System.out.println("Example from Java Cryptography: Tools and Techniques by David Hook & Jon Eaves");
        System.out.println("get source files: https://www.bouncycastle.org/java-crypto-tools-src.zip");
        elgamalExample();
        ecExample();
    }
}