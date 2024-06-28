package com.sid.conversions;

import java.util.Scanner;

public class GallonsToLiters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter volume in gallons: ");
        double gallons = scanner.nextDouble();
        scanner.close();

        double liters = convertGallonsToLiters(gallons);
        System.out.println("Volume in liters: " + liters);
    }

    private static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

}