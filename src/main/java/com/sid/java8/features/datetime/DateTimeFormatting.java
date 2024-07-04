package com.sid.java8.features.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class DateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}