package com.sid.conversions;

import java.util.Scanner;

public class KilogramsToPounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double kilograms = scanner.nextDouble();
        scanner.close();

        double pounds = convertKilogramsToPounds(kilograms);
        System.out.println("Weight in pounds: " + pounds);
    }

    private static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

}