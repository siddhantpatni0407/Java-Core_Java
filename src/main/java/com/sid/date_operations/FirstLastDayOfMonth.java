package com.sid.date_operations;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Siddhant Patni
 */

public class FirstLastDayOfMonth {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("First day of the month: " + firstDay);
        System.out.println("Last day of the month: " + lastDay);
    }
}