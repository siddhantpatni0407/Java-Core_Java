package com.sid.algorithm.security.encryption_decryption;

import java.nio.charset.StandardCharsets;
import java.security.*;
import javax.crypto.Cipher;
import java.util.Base64;

/**
 * RSA Encryption and Decryption Example
 * Uses 2048-bit RSA key pair for secure encryption/decryption.
 */
public class RSAExample {

    /**
     * Generates an RSA key pair (Public and Private Key).
     * @return KeyPair containing public and private RSA keys.
     * @throws Exception if key generation fails.
     */
    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048); // 2048-bit RSA for strong security
        return keyGen.generateKeyPair();
    }

    /**
     * Encrypts a given plaintext using an RSA public key.
     * @param data The plaintext to encrypt.
     * @param publicKey The RSA public key used for encryption.
     * @return The Base64 encoded encrypted text.
     * @throws Exception if encryption fails.
     */
    public static String encrypt(String data, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes); // Encode to Base64 for safe transmission
    }

    /**
     * Decrypts a Base64 encoded encrypted text using an RSA private key.
     * @param encryptedData The Base64 encoded encrypted text.
     * @param privateKey The RSA private key used for decryption.
     * @return The decrypted plaintext.
     * @throws Exception if decryption fails.
     */
    public static String decrypt(String encryptedData, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        try {
            // Step 1: Generate RSA Key Pair
            KeyPair keyPair = generateKeyPair();

            // Print Base64 Encoded Public and Private Keys
            System.out.println("Public Key (Base64): " + Base64.getEncoder().encodeToString(keyPair.getPublic().getEncoded()));
            System.out.println("Private Key (Base64): " + Base64.getEncoder().encodeToString(keyPair.getPrivate().getEncoded()));

            // Step 2: Define plaintext to encrypt
            String originalText = "Hello RSA";
            System.out.println("Original Text: " + originalText);

            // Step 3: Encrypt the plaintext using the public key
            String encryptedText = encrypt(originalText, keyPair.getPublic());
            System.out.println("Encrypted Text (Base64): " + encryptedText);

            // Step 4: Decrypt the encrypted text using the private key
            String decryptedText = decrypt(encryptedText, keyPair.getPrivate());
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            System.err.println("Error during encryption/decryption: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
