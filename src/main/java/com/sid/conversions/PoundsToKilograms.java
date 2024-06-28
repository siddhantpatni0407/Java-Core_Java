package com.sid.conversions;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        scanner.close();

        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println("Weight in kilograms: " + kilograms);
    }

    private static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

}