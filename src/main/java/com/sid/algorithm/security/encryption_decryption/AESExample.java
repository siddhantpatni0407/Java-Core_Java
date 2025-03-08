package com.sid.algorithm.security.encryption_decryption;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * AES Encryption/Decryption using AES-GCM (Advanced Encryption Standard in Galois/Counter Mode).
 * This ensures **high security** with authenticated encryption.
 * <p>
 * Features:
 * ✅ Secure Key Generation (AES-256)
 * ✅ AES-GCM Mode (Recommended over CBC)
 * ✅ Random IV for Each Encryption (Prevents Replay Attacks)
 * ✅ Base64 Encoding for Storage & Transmission
 * <p>
 * Author: Siddhant Patni
 */
public class AESExample {

    // AES Algorithm Constants
    private static final String AES_ALGORITHM = "AES";
    private static final String AES_TRANSFORMATION = "AES/GCM/NoPadding"; // GCM for security
    private static final int AES_KEY_SIZE = 256; // Strong encryption
    private static final int IV_SIZE = 12; // Recommended IV size for AES-GCM
    private static final int GCM_TAG_LENGTH = 128; // Authentication tag length (bits)

    /**
     * Step 1: Generates a **Secure AES-256 Key** using Java's KeyGenerator.
     * This key is used for both encryption & decryption.
     *
     * @return SecretKey AES-256 secret key
     * @throws Exception if key generation fails
     */
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AES_ALGORITHM);
        keyGenerator.init(AES_KEY_SIZE, new SecureRandom()); // Use SecureRandom for high security
        return keyGenerator.generateKey();
    }

    /**
     * Step 2: Encrypts a string using **AES-GCM mode**.
     * AES-GCM provides both encryption & authentication (protection against data tampering).
     *
     * @param data      Plain text to encrypt
     * @param secretKey AES SecretKey (Must be securely stored)
     * @return Encrypted text as Base64 (IV + CipherText)
     * @throws Exception if encryption fails
     */
    public static String encrypt(String data, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_TRANSFORMATION);

        // Step 2.1: Generate a random IV (Initialization Vector)
        byte[] iv = generateIV();
        GCMParameterSpec parameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);

        // Step 2.2: Initialize Cipher for Encryption
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, parameterSpec);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());

        // Step 2.3: Prepend IV to the encrypted data
        byte[] encryptedWithIV = new byte[IV_SIZE + encryptedBytes.length];
        System.arraycopy(iv, 0, encryptedWithIV, 0, IV_SIZE);
        System.arraycopy(encryptedBytes, 0, encryptedWithIV, IV_SIZE, encryptedBytes.length);

        // Step 2.4: Convert encrypted bytes to Base64 for easy transmission/storage
        return Base64.getEncoder().encodeToString(encryptedWithIV);
    }

    /**
     * Step 3: Decrypts the AES-GCM encrypted text.
     * Extracts the IV, then decrypts the actual cipher text.
     *
     * @param encryptedData Encrypted text (Base64-encoded)
     * @param secretKey     AES SecretKey (Must match the key used for encryption)
     * @return Decrypted plain text
     * @throws Exception if decryption fails
     */
    public static String decrypt(String encryptedData, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_TRANSFORMATION);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedData);

        // Step 3.1: Extract IV from encrypted data
        byte[] iv = new byte[IV_SIZE];
        System.arraycopy(decodedBytes, 0, iv, 0, IV_SIZE);

        // Step 3.2: Extract actual encrypted text (excluding IV)
        byte[] encryptedBytes = new byte[decodedBytes.length - IV_SIZE];
        System.arraycopy(decodedBytes, IV_SIZE, encryptedBytes, 0, encryptedBytes.length);

        // Step 3.3: Initialize Cipher for Decryption
        GCMParameterSpec parameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, parameterSpec);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

        // Step 3.4: Convert decrypted bytes to String
        return new String(decryptedBytes);
    }

    /**
     * Step 4: Generates a **Secure Random IV** (Initialization Vector).
     * IV is crucial for AES-GCM security and should never be reused.
     *
     * @return IV byte array
     */
    private static byte[] generateIV() {
        byte[] iv = new byte[IV_SIZE];
        new SecureRandom().nextBytes(iv); // SecureRandom for cryptographic security
        return iv;
    }

    /**
     * Step 5: Converts a SecretKey to a **Base64 String** for storage.
     * This allows easy persistence of the AES key.
     *
     * @param secretKey The AES SecretKey
     * @return Base64 encoded key
     */
    public static String encodeKey(SecretKey secretKey) {
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }

    /**
     * Step 6: Decodes a **Base64-encoded AES key** back into a SecretKey.
     *
     * @param encodedKey Base64 encoded AES key
     * @return SecretKey
     */
    public static SecretKey decodeKey(String encodedKey) {
        byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
        return new SecretKeySpec(decodedKey, AES_ALGORITHM);
    }

    /**
     * Step 7: Main method to demonstrate encryption and decryption.
     */
    public static void main(String[] args) {
        try {
            // Generate AES Key
            SecretKey secretKey = generateKey();
            String base64Key = encodeKey(secretKey); // Store key in Base64 format
            System.out.println("🔑 Generated AES Key (Base64): " + base64Key);

            // Sample plaintext
            String originalText = "Siddhant Patni";
            System.out.println("\n📝 Original Text: " + originalText);

            // Encrypt
            String encryptedText = encrypt(originalText, secretKey);
            System.out.println("\n🔒 Encrypted Text: " + encryptedText);

            // Decrypt
            String decryptedText = decrypt(encryptedText, secretKey);
            System.out.println("\n🔓 Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            System.err.println("❌ Error during encryption/decryption: " + e.getMessage());
            e.printStackTrace();
        }
    }

}