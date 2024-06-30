package com.sid.date_operations;

import java.time.LocalDate;

/**
 * @author Siddhant Patni
 */
public class AddSubtractDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        LocalDate newDate = date.plusDays(10);
        System.out.println("Date after adding 10 days: " + newDate);

        newDate = date.minusMonths(2);
        System.out.println("Date after subtracting 2 months: " + newDate);

        newDate = date.plusYears(5);
        System.out.println("Date after adding 5 years: " + newDate);
    }
}