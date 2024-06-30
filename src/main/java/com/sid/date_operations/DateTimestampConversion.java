package com.sid.date_operations;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class DateTimestampConversion {
    public static void main(String[] args) {
        // Convert LocalDateTime to Timestamp
        LocalDateTime dateTime = LocalDateTime.now();
        Instant timestamp = dateTime.atZone(ZoneId.systemDefault()).toInstant();
        System.out.println("Current timestamp: " + timestamp.toEpochMilli());

        // Convert Timestamp to LocalDateTime
        LocalDateTime dateTimeFromTimestamp = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Converted LocalDateTime: " + dateTimeFromTimestamp.format(formatter));
    }
}