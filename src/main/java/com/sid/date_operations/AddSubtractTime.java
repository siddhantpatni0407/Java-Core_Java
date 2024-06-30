package com.sid.date_operations;

import java.time.LocalTime;

/**
 * @author Siddhant Patni
 */
public class AddSubtractTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        LocalTime newTime = time.plusHours(2).minusMinutes(30).plusSeconds(45);

        System.out.println("Original time: " + time);
        System.out.println("New time after adding 2 hours, subtracting 30 minutes, and adding 45 seconds: " + newTime);
    }
}