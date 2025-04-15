package com.sid.utility;

import java.util.UUID;

/**
 * @author Siddhant Patni
 */
public class RandomUtil {

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        System.out.println("Generated UUID: " + generateUUID());
    }

}