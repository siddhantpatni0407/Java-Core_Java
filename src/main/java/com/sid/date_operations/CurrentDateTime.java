package com.sid.date_operations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = now.format(formatter);
        System.out.println("Current date and time: " + formattedDateTime);
    }
}