/**
 * The new RandomGenerator API simplifies random value generation.
 */

package com.sid.java21.features;

import java.util.random.RandomGenerator;

/**
 * @author Siddhant Patni
 */
public class RandomGeneratorExample {
    public static void main(String[] args) {
        RandomGenerator random = RandomGenerator.of("L128X256MixRandom");

        System.out.println("Random Int: " + random.nextInt());
        System.out.println("Random Double: " + random.nextDouble());
    }
}