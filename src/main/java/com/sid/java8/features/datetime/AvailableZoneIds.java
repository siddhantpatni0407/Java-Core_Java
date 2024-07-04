package com.sid.java8.features.datetime;

import java.time.ZoneId;
import java.util.Set;

/**
 * @author Siddhant Patni
 */
public class AvailableZoneIds {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        System.out.println("Total available TimeZone : " + zoneIds.size());

        zoneIds.forEach(System.out::println);
    }
}