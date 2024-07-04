package com.sid.java8.features.datetime;

import java.time.LocalDate;

/**
 * @author Siddhant Patni
 */
public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1996, 7, 4);

        System.out.println("Today: " + today);
        System.out.println("Birthday: " + birthday);
    }
}