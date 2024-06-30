package com.sid.date_operations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Siddhant Patni
 */
public class StartEndOfDay {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDateTime startOfDay = today.atStartOfDay();
        LocalDateTime endOfDay = today.atTime(LocalTime.MAX);

        System.out.println("Start of the day: " + startOfDay);
        System.out.println("End of the day: " + endOfDay);
    }
}