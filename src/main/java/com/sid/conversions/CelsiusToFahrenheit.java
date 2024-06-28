package com.sid.conversions;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();

        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

}