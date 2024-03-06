package com.sid.conversions;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();

        String hexadecimal = convertDecimalToHexadecimal(decimal);
        System.out.println("Hexadecimal representation: " + hexadecimal);
    }

    private static String convertDecimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

}