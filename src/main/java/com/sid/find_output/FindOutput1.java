package com.sid.find_output;

/**
 * @author Siddhant Patni
 */
public class FindOutput1 {

    final static void goOne(final int x) {
        System.out.print("int " + x);
    }

    final static void goOne(final int... x) {
        System.out.print(" int... " + x[0]);
    }

    public static void main(String[] args) {
        goOne(3);
        goOne(1, 2, 3);
    }

}