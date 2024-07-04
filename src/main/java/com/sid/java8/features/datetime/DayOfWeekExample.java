package com.sid.java8.features.datetime;

import java.time.LocalDate;

/**
 * @author Siddhant Patni
 */
public class DayOfWeekExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 7, 3);

        System.out.println("Day of Week: " + date.getDayOfWeek());
    }
}