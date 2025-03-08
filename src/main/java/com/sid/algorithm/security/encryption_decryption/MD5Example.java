package com.sid.algorithm.security.encryption_decryption;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5 Hashing Example
 * Author: Siddhant Patni
 */
public class MD5Example {

    /**
     * Generates an MD5 hash for the given input string.
     *
     * @param data The input string to hash.
     * @return The MD5 hash as a hexadecimal string.
     * @throws NoSuchAlgorithmException if the MD5 algorithm is not available.
     */
    public static String hash(String data) throws NoSuchAlgorithmException {
        // Get MD5 MessageDigest instance
        MessageDigest md = MessageDigest.getInstance("MD5");

        // Compute the MD5 digest (hash) of the input string
        byte[] digest = md.digest(data.getBytes(StandardCharsets.UTF_8));

        // Convert byte array to hexadecimal format
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            // Define the input text
            String inputText = "Hello MD5";
            System.out.println("Original Text: " + inputText);

            // Generate and print MD5 hash
            String hashValue = hash(inputText);
            System.out.println("MD5 Hash: " + hashValue);

        } catch (NoSuchAlgorithmException e) {
            System.err.println("MD5 Algorithm not found: " + e.getMessage());
            e.printStackTrace();
        }
    }

}