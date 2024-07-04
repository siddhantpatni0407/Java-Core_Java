package com.sid.enum_operations;

/**
 * Example of an enum with constructor and methods.
 *
 * @author Siddhant Patni
 */
public class EnumWithMethodsExample {

    // Define the enum type with a constructor and methods
    enum TrafficSignal {
        RED("Stop"), GREEN("Go"), YELLOW("Prepare to stop");

        private String action;

        // Constructor
        TrafficSignal(String action) {
            this.action = action;
        }

        // Method to get action
        public String getAction() {
            return action;
        }
    }

    public static void main(String[] args) {
        // Using enum constants and methods
        TrafficSignal signal = TrafficSignal.RED;

        // Accessing enum method
        System.out.println("When the light is " + signal + ", " + signal.getAction());
    }
}