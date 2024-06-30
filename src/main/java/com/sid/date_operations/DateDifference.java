package com.sid.date_operations;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Siddhant Patni
 */

public class DateDifference {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 6, 30);
        LocalDate date2 = LocalDate.of(2024, 6, 30);

        Period period = Period.between(date1, date2);

        System.out.println("Difference is " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days.");
    }
}