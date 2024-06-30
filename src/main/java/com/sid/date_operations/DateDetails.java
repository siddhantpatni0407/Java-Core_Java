package com.sid.date_operations;

import java.time.LocalDate;

/**
 * @author Siddhant Patni
 */

public class DateDetails {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        String dayOfWeek = date.getDayOfWeek().toString();

        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("Day of the Week: " + dayOfWeek);
    }
}