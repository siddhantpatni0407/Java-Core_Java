package com.sid.date_operations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class DateToISO8601 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_DATE_TIME;

        String isoDate = dateTime.format(isoFormatter);
        System.out.println("ISO 8601 formatted date: " + isoDate);
    }
}