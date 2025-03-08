package com.sid.algorithm.security.encryption_decryption;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * SHA-256 Hashing Example
 * Author: Siddhant Patni
 */
public class SHA256Example {

    /**
     * Generates a SHA-256 hash for the given input string.
     *
     * @param data The input string to hash.
     * @return The SHA-256 hash as a hexadecimal string.
     */
    public static String hash(String data) {
        try {
            // Get instance of SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Convert input string to bytes using UTF-8 encoding
            byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));

            // Convert byte array to hexadecimal representation
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b)); // Convert byte to hex
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-256 Algorithm not found: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        // Define input text
        String inputText = "Hello SHA-256";
        System.out.println("Original Text: " + inputText);

        // Generate and print SHA-256 hash
        String hashValue = hash(inputText);
        if (hashValue != null) {
            System.out.println("SHA-256 Hash: " + hashValue);
        }
    }

}