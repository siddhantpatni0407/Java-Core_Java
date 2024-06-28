package com.sid.conversions;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        scanner.close();

        double kilometers = convertMilesToKilometers(miles);
        System.out.println("Distance in kilometers: " + kilometers);
    }

    private static double convertMilesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
