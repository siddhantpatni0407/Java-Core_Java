/**
 * Problem statement - Write a Java program to demonstrate Comparable and Comparator for Employee sorting.
 */
package com.sid.comparable_and_comparator;

import com.sid.common.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class EmployeeSortingExample {
    /**
     * Sort employees by Employee ID (Natural Order using Comparable).
     */
    private static void sortByEmployeeId(List<Employee> employees) {
        System.out.println("Sorting by Employee ID (Natural Order - Comparable):");
        employees.sort(Comparator.naturalOrder());
        employees.forEach(System.out::println);
        System.out.println();
    }

    /**
     * Sort employees by Employee Name, then by Employee ID.
     */
    private static void sortByNameThenId(List<Employee> employees) {
        System.out.println("Sorting by Employee Name then Employee ID:");
        employees.sort(Comparator.comparing(Employee::getEmployeeName)
                .thenComparing(Employee::getEmployeeId));
        employees.forEach(System.out::println);
        System.out.println();
    }

    /**
     * Sort employees by Employee Name, then by Employee ID in reverse order.
     */
    private static void sortByNameThenIdReversed(List<Employee> employees) {
        System.out.println("Sorting by Employee Name then Employee ID (Reversed):");
        employees.sort(Comparator.comparing(Employee::getEmployeeName)
                .thenComparing(Employee::getEmployeeId)
                .reversed());
        employees.forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(11, "Siddhant"),
                new Employee(53, "Piyush"),
                new Employee(13, "Dinesh"),
                new Employee(76, "Saneesh"),
                new Employee(22, "Shivaraj"),
                new Employee(22, "Bharath"),
                new Employee(12, "Shivaraj")
        ));

        // Perform sorting operations
        sortByEmployeeId(employees);
        sortByNameThenId(employees);
        sortByNameThenIdReversed(employees);
    }

}