package com.sid.conversions;

import java.util.Scanner;

public class MphToKph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed in miles per hour: ");
        double mph = scanner.nextDouble();
        scanner.close();

        double kph = convertMphToKph(mph);
        System.out.println("Speed in kilometers per hour: " + kph);
    }

    private static double convertMphToKph(double mph) {
        return mph * 1.60934;
    }

}