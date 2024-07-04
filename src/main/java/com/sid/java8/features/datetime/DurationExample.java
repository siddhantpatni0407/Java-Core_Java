package com.sid.java8.features.datetime;

import java.time.Duration;
import java.time.LocalTime;

/**
 * @author Siddhant Patni
 */
public class DurationExample {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(8, 30);
        LocalTime end = LocalTime.of(10, 45);

        Duration duration = Duration.between(start, end);

        System.out.println("Duration: " + duration.toHours() + " hours " + duration.toMinutes() % 60 + " minutes");
    }
}