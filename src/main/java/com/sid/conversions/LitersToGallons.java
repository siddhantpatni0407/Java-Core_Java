package com.sid.conversions;

import java.util.Scanner;

public class LitersToGallons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter volume in liters: ");
        double liters = scanner.nextDouble();
        scanner.close();

        double gallons = convertLitersToGallons(liters);
        System.out.println("Volume in gallons: " + gallons);
    }

    private static double convertLitersToGallons(double liters) {
        return liters / 3.78541;
    }

}