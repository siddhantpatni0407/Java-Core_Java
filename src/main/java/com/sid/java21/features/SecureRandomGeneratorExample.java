/**
 * Generating random numbers securely and efficiently.
 */

package com.sid.java21.features;

import java.util.random.RandomGenerator;

/**
 * @author Siddhant Patni
 */
public class SecureRandomGeneratorExample {
    public static void main(String[] args) {
        RandomGenerator secureRandom = RandomGenerator.of("SecureRandom");

        System.out.println("Secure Random Int: " + secureRandom.nextInt(100)); // Range: 0-99
        System.out.println("Secure Random Long: " + secureRandom.nextLong());
    }
}