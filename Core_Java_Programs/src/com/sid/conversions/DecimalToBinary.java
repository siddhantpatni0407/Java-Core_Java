package com.sid.conversions;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();

        String binary = convertDecimalToBinary(decimal);
        System.out.println("Binary representation: " + binary);
    }

    private static String convertDecimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Insert the remainder at the beginning
            decimal /= 2; // Divide the decimal number by 2
        }

        return binary.toString();
    }
}