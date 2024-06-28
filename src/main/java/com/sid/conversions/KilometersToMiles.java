package com.sid.conversions;

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        scanner.close();

        double miles = convertKilometersToMiles(kilometers);
        System.out.println("Distance in miles: " + miles);
    }

    private static double convertKilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

}