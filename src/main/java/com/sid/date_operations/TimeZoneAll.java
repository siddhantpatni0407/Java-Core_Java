package com.sid.date_operations;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
 * @author Siddhant Patni
 */
public class TimeZoneAll {
    public static void main(String[] args) {
        // Get all available zone IDs
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        // Define various date and time formats
        DateTimeFormatter[] formatters = {
                DateTimeFormatter.ofPattern("dd-MM-yyyy"),
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z"),
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss Z"),
                DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a Z"),
                DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss Z"),
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
        };

        // Print the current date and time in each time zone, formatted in different ways
        for (String zoneId : allZoneIds) {
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
            System.out.println("Time zone: " + zoneId);
            for (DateTimeFormatter formatter : formatters) {
                String formattedDateTime = zonedDateTime.format(formatter);
                System.out.println("Formatted time: " + formattedDateTime);
            }
            System.out.println();
        }
    }
}