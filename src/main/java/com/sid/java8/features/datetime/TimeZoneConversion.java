package com.sid.java8.features.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Siddhant Patni
 */
public class TimeZoneConversion {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId zoneIdNY = ZoneId.of("America/New_York");
        ZoneId zoneIdLA = ZoneId.of("America/Los_Angeles");

        ZonedDateTime nyDateTime = dateTime.atZone(zoneIdNY);
        ZonedDateTime laDateTime = nyDateTime.withZoneSameInstant(zoneIdLA);

        System.out.println("New York DateTime: " + nyDateTime);
        System.out.println("Los Angeles DateTime: " + laDateTime);
    }
}