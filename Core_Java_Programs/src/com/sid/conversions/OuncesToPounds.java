package com.sid.conversions;

import java.util.Scanner;

public class OuncesToPounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in ounces: ");
        double ounces = scanner.nextDouble();
        scanner.close();

        double pounds = convertOuncesToPounds(ounces);
        System.out.println("Weight in pounds: " + pounds);
    }

    private static double convertOuncesToPounds(double ounces) {
        return ounces / 16;
    }

}