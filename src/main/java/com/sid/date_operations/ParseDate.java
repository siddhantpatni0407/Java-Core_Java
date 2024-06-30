package com.sid.date_operations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Siddhant Patni
 */
public class ParseDate {
    public static void main(String[] args) {
        String dateStr = "2024-06-30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed date: " + date);
    }
}