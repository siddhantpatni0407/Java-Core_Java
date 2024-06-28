package com.sid.conversions;

import java.util.Scanner;

public class KphToMph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed in kilometers per hour: ");
        double kph = scanner.nextDouble();
        scanner.close();

        double mph = convertKphToMph(kph);
        System.out.println("Speed in miles per hour: " + mph);
    }

    private static double convertKphToMph(double kph) {
        return kph / 1.60934;
    }

}