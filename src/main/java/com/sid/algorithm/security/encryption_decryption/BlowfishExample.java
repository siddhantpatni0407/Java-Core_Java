package com.sid.algorithm.security.encryption_decryption;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Blowfish Encryption and Decryption Example
 * Author: Siddhant Patni
 */
public class BlowfishExample {

    /**
     * Generates a random 128-bit Blowfish secret key.
     *
     * @return SecretKey - The generated Blowfish key.
     * @throws Exception if key generation fails.
     */
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
        keyGenerator.init(128); // Set Blowfish key size (128-bit)
        return keyGenerator.generateKey();
    }

    /**
     * Encrypts the given plaintext using Blowfish encryption.
     *
     * @param data The plaintext to encrypt.
     * @param key  The secret key for encryption.
     * @return The Base64 encoded ciphertext.
     * @throws Exception if encryption fails.
     */
    public static String encrypt(String data, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes); // Convert to Base64 for readability
    }

    /**
     * Decrypts the given Base64 encoded ciphertext using Blowfish decryption.
     *
     * @param encryptedData The Base64 encoded encrypted text.
     * @param key           The secret key for decryption.
     * @return The decrypted plaintext.
     * @throws Exception if decryption fails.
     */
    public static String decrypt(String encryptedData, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        try {
            // Step 1: Generate a Blowfish secret key
            SecretKey key = generateKey();
            System.out.println("Generated Blowfish Key (Base64 Encoded): " + Base64.getEncoder().encodeToString(key.getEncoded()));

            // Step 2: Define plaintext to encrypt
            String originalText = "Hello Blowfish";
            System.out.println("Original Text: " + originalText);

            // Step 3: Encrypt the plaintext
            String encryptedText = encrypt(originalText, key);
            System.out.println("Encrypted Text (Base64): " + encryptedText);

            // Step 4: Decrypt the encrypted text
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            System.err.println("Encryption/Decryption error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}