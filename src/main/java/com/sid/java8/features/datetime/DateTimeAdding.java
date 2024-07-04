package com.sid.java8.features.datetime;

import java.time.LocalDate;

/**
 * @author Siddhant Patni
 */
public class DateTimeAdding {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate nextYear = today.plusYears(1);

        System.out.println("Today: " + today);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Next Month: " + nextMonth);
        System.out.println("Next Year: " + nextYear);
    }
}