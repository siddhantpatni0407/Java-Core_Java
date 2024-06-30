package com.sid.date_operations;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class TimeZoneExample {
    public static void main(String[] args) {
        ZonedDateTime nowInUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime nowInIST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");

        System.out.println("Current time in UTC: " + nowInUTC.format(formatter));
        System.out.println("Current time in IST: " + nowInIST.format(formatter));
    }
}