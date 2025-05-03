/**
 * Create an Employee class with attributes empId, firstName, lastName, gender, and salary.
 * Use Java 8 streams to implement the following functionalities:
 * 1. Find Highest salary
 * 2. Sort employees based on first name and last name
 * 3. Increase salary by 20%
 */

package com.sid.interview_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    private int empId;
    private String firstName;
    private String lastName;
    private String gender;
    private double salary;

    // Constructor
    public Employee1(int empId, String firstName, String lastName, String gender, double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    // toString method for printing Employee details
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Program28 {

    public static void main(String[] args) {
        // Sample Employee list
        List<Employee1> employees = Arrays.asList(
                new Employee1(1, "John", "Doe", "Male", 50000),
                new Employee1(2, "Jane", "Smith", "Female", 60000),
                new Employee1(3, "Alice", "Johnson", "Female", 75000),
                new Employee1(4, "Bob", "Lee", "Male", 40000)
        );

        // 1. Find highest salary
        Employee1 highestSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee1::getSalary))
                .orElseThrow(() -> new RuntimeException("No employees found"));
        System.out.println("Highest Salary Employee: " + highestSalaryEmployee);

        // 2. Sort employees based on first name and last name
        List<Employee1> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee1::getFirstName).thenComparing(Employee1::getLastName))
                .collect(Collectors.toList());
        System.out.println("\nSorted Employees:");
        sortedEmployees.forEach(System.out::println);

        // 3. Increase salary by 20%
        List<Employee1> updatedSalaries = employees.stream()
                .map(employee -> new Employee1(
                        employee.getEmpId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getGender(),
                        employee.getSalary() * 1.20))
                .collect(Collectors.toList());

        System.out.println("\nEmployees after 20% salary increase:");
        updatedSalaries.forEach(System.out::println);
    }

}