package com.sid.conversions;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.nextLine();
        scanner.close();

        int decimal = convertHexadecimalToDecimal(hexadecimal);
        System.out.println("Decimal representation: " + decimal);
    }

    private static int convertHexadecimalToDecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }
}
