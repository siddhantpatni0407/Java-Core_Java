package com.sid.java8.features.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Siddhant Patni
 */
public class DaysBetweenDates {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 7, 1);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Days Between: " + daysBetween);
    }
}