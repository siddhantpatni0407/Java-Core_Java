/**
 * Parsing a string date into a LocalDateTime with advanced patterns.
 */

package com.sid.java21.features;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class AdvancedDateTimeExample {
    public static void main(String[] args) {
        String dateTimeStr = "2024-12-15T14:30:00";
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
        System.out.println("Parsed Date-Time: " + dateTime);

        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of("America/New_York"));
        System.out.println("With Time Zone: " + zonedDateTime);
    }
}