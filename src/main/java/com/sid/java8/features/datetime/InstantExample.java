package com.sid.java8.features.datetime;

import java.time.Instant;

/**
 * @author Siddhant Patni
 */
public class InstantExample {
    public static void main(String[] args) {
        Instant now = Instant.now();

        System.out.println("Current Instant: " + now);
    }
}