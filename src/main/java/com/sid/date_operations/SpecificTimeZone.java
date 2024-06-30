package com.sid.date_operations;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class SpecificTimeZone {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
        String formattedDateTime = zonedDateTime.format(formatter);

        System.out.println("Current date and time in New York: " + formattedDateTime);
    }
}