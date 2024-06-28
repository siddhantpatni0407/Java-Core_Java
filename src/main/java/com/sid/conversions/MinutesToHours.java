package com.sid.conversions;

import java.util.Scanner;

public class MinutesToHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in minutes: ");
        double minutes = scanner.nextDouble();
        scanner.close();

        double hours = convertMinutesToHours(minutes);
        System.out.println("Time in hours: " + hours);
    }

    private static double convertMinutesToHours(double minutes) {
        return minutes / 60;
    }

}