package com.sid.find_output_programs;

/**
 * @author Siddhant Patni
 */
class FindOutput5 {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object o) {
        System.out.println("Object method");
    }

    public static void method(Integer i) {
        System.out.println("Integer method");
    }
}