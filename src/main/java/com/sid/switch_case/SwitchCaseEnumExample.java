package com.sid.switch_case;

/**
 * @author Siddhant Patni
 */
public class SwitchCaseEnumExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        String dayType;

        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                dayType = "Weekday";
                break;
            case SATURDAY:
            case SUNDAY:
                dayType = "Weekend";
                break;
            default:
                dayType = "Unknown";
                break;
        }

        System.out.println(today + " is a " + dayType);
    }
}