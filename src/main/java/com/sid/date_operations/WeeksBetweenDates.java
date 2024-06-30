package com.sid.date_operations;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Siddhant Patni
 */
public class WeeksBetweenDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 12, 31);

        long weeksBetween = ChronoUnit.WEEKS.between(date1, date2);
        System.out.println("Number of weeks between: " + weeksBetween);
    }
}