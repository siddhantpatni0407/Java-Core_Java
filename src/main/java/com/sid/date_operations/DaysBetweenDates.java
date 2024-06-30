package com.sid.date_operations;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Siddhant Patni
 */
public class DaysBetweenDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 6, 30);
        LocalDate date2 = LocalDate.of(2024, 6, 30);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Number of days between: " + daysBetween);
    }
}