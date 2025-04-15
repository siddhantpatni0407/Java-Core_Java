package com.sid.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class DateTimeUtil {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String getCurrentTimestamp() {
        return LocalDateTime
                .now()
                .format(formatter);
    }

    public static String formatDateTime(LocalDateTime dateTime) {
        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        System.out.println("Current Timestamp: " + getCurrentTimestamp());
    }

}