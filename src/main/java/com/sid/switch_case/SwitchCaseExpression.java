package com.sid.switch_case;

/**
 * @author Siddhant Patni
 */
public class SwitchCaseExpression {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };

        System.out.println("Day of the week: " + dayName);
    }
}