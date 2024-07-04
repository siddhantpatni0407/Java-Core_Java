package com.sid.java8.features.datetime;

import java.time.LocalDateTime;

/**
 * @author Siddhant Patni
 */
public class CreateDateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 7, 3, 12, 0);

        System.out.println("Specific DateTime: " + dateTime);
    }
}