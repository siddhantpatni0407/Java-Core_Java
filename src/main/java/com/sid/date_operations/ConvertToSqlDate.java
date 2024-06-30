package com.sid.date_operations;

import java.time.LocalDate;
import java.sql.Date;

/**
 * @author Siddhant Patni
 */
public class ConvertToSqlDate {
    public static void main(String[] args) {
        // Convert LocalDate to java.sql.Date
        LocalDate localDate = LocalDate.now();
        Date sqlDate = Date.valueOf(localDate);
        System.out.println("java.sql.Date: " + sqlDate);

        // Convert java.sql.Date to LocalDate
        LocalDate convertedLocalDate = sqlDate.toLocalDate();
        System.out.println("Converted LocalDate: " + convertedLocalDate);
    }
}