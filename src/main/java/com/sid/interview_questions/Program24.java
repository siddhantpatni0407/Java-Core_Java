/**
 * Write a Java Program to increase the salary of all employees by 5000 and filter those whose names start with 'A' using Java 8.
 *
 * @author Siddhant Patni
 */
package com.sid.interview_questions;


import lombok.Setter;

import java.util.Arrays;
import java.util.List;

class Employee {

    private int empId;
    private String name;
    @Setter
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + empId + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class Program24 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Akash", 40000),
                new Employee(102, "Bobby", 45000),
                new Employee(103, "Aniket", 42000),
                new Employee(104, "Chetan", 47000)
        );

        // Approach - 1
        // Create a new list: increase salary and filter names starting with 'A'
        System.out.println("Approach - 1");
        List<Employee> filtered1 = employees.stream()
                .map(emp -> new Employee(emp.getEmpId(), emp.getName(), emp.getSalary() + 5000))
                .filter(emp -> emp.getName().startsWith("A"))
                .toList();

        filtered1.forEach(System.out::println);


        // Approach - 2
        // Using peek
        System.out.println("Approach - 2");
        List<Employee> filtered2 = employees.stream()
                .peek(emp -> emp.setSalary(emp.getSalary() + 5000)) // increase salary
                .filter(emp -> emp.getName().startsWith("A"))       // filter by name
                .toList();

        filtered2.forEach(System.out::println);

    }

}