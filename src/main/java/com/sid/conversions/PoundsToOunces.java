package com.sid.conversions;

import java.util.Scanner;

public class PoundsToOunces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        scanner.close();

        double ounces = convertPoundsToOunces(pounds);
        System.out.println("Weight in ounces: " + ounces);
    }

    private static double convertPoundsToOunces(double pounds) {
        return pounds * 16;
    }

}