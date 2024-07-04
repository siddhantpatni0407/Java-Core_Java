package com.sid.enum_operations;

/**
 * Example of an enum with fields and methods.
 *
 * @author Siddhant Patni
 */
public class EnumWithFieldsAndMethodsExample {

    // Define the enum type with fields and methods
    enum CoffeeSize {
        SMALL(8), MEDIUM(12), LARGE(16);

        private int ounces;

        // Constructor
        CoffeeSize(int ounces) {
            this.ounces = ounces;
        }

        // Method to get ounces
        public int getOunces() {
            return ounces;
        }

        // Method to describe the size
        public String getSizeDescription() {
            return switch (this) {
                case SMALL -> "Small";
                case MEDIUM -> "Medium";
                case LARGE -> "Large";
            };
        }
    }

    public static void main(String[] args) {
        // Using enum constants and methods
        CoffeeSize size = CoffeeSize.MEDIUM;

        // Accessing enum fields and methods
        System.out.println("Size: " + size.getSizeDescription());
        System.out.println("Ounces: " + size.getOunces());
    }
}