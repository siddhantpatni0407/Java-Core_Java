package com.sid.enum_operations;

/**
 * @author Siddhant Patni
 */
public class DayOfWeekExample {

    // Define the enum type
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Using enum constants
        Day today = Day.WEDNESDAY;

        // Switch-case based on enum
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a weekday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend day.");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }
    }
}