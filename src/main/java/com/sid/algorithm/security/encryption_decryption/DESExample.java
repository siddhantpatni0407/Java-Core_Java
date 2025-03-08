package com.sid.algorithm.security.encryption_decryption;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * DES (Data Encryption Standard) Encryption and Decryption Example
 * Author: Siddhant Patni
 */
public class DESExample {

    /**
     * Generates a DES secret key with a key size of 56 bits.
     *
     * @return SecretKey - The generated DES key.
     * @throws Exception if key generation fails.
     */
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        keyGenerator.init(56); // DES key size (56-bit)
        return keyGenerator.generateKey();
    }

    /**
     * Encrypts a given plaintext using DES encryption.
     *
     * @param data The plaintext to encrypt.
     * @param key  The secret key for encryption.
     * @return The Base64 encoded encrypted text.
     * @throws Exception if encryption fails.
     */
    public static String encrypt(String data, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes); // Encode in Base64 for safe transmission
    }

    /**
     * Decrypts a Base64 encoded encrypted text using DES decryption.
     *
     * @param encryptedData The Base64 encoded encrypted text.
     * @param key           The secret key for decryption.
     * @return The decrypted plaintext.
     * @throws Exception if decryption fails.
     */
    public static String decrypt(String encryptedData, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        try {
            // Step 1: Generate a DES Secret Key
            SecretKey key = generateKey();
            System.out.println("Generated DES Key (Base64 Encoded): " + Base64.getEncoder().encodeToString(key.getEncoded()));

            // Step 2: Define plaintext to encrypt
            String originalText = "Hello DES";
            System.out.println("Original Text: " + originalText);

            // Step 3: Encrypt the plaintext
            String encryptedText = encrypt(originalText, key);
            System.out.println("Encrypted Text (Base64): " + encryptedText);

            // Step 4: Decrypt the encrypted text
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            System.err.println("Encryption/Decryption Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}