package com.sid.date_operations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class ParseISO8601 {
    public static void main(String[] args) {
        String isoDate = "2024-06-30T15:34:56";
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_DATE_TIME;

        LocalDateTime dateTime = LocalDateTime.parse(isoDate, isoFormatter);
        System.out.println("Parsed LocalDateTime: " + dateTime);
    }
}