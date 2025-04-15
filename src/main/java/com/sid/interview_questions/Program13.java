/**
 * Program to find the highest and second-highest salary of employee using java 8.
 */

package com.sid.interview_questions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class Program13 {

    public static void main(String[] args) {

        @Data
        @AllArgsConstructor
        class Employee {
            private int id;
            private String name;
            private double salary;
        }

        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "John", 1000),
                new Employee(102, "Jane", 2000),
                new Employee(103, "Bob", 3000),
                new Employee(104, "Alice", 4000),
                new Employee(105, "Charlie", 5000)
        );

        // 1. Find highest-salary of employee
        Optional<Employee> employeeWithHighestSalary = employeeList
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        // Print result safely using Optional
        employeeWithHighestSalary.ifPresent(emp -> {
            System.out.println("Employee with Highest Salary:");
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
        });

        // 2. Find second-highest salary of employee
        Optional<Employee> employeeWithSecondHighestSalary = employeeList
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();

        // 3. Print result safely using Optional
        employeeWithSecondHighestSalary.ifPresent(emp -> {
            System.out.println("Employee with Second Highest Salary:");
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
        });

        // 4. Average salary of employees
        double avgSalary = employeeList
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("\n Average Salary: " + avgSalary);

        // 5. Group employees by salary
        Map<Double, List<Employee>> groupedBySalary = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println("\n Employees Grouped by Salary:");
        groupedBySalary
                .forEach((salary, emps) -> {
                    System.out.println("Salary: " + salary + " → " + emps);
                });

        // 6. Names of all employees sorted alphabetically
        List<String> sortedNames = employeeList
                .stream()
                .map(Employee::getName)
                .sorted()
                .toList();
        System.out.println("\n🔤 Employee Names (Sorted): " + sortedNames);

        // 7. Summary statistics of salaries
        DoubleSummaryStatistics stats = employeeList
                .stream()
                .mapToDouble(Employee::getSalary)
                .summaryStatistics();
        System.out.println("\n📈 Salary Summary:");
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());

        // 8. Filter employees with salary > 3000
        System.out.println("\n🔍 Employees with salary > 3000:");
        employeeList
                .stream()
                .filter(emp -> emp.getSalary() > 3000)
                .forEach(System.out::println);

        // 9. Convert employee list to map (id -> name)
        Map<Integer, String> employeeMap = employeeList
                .stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println("\n🗺️ Employee Map (ID -> Name): " + employeeMap);

        // 10. Check if all employees have salary > 0
        boolean allPositiveSalary = employeeList
                .stream()
                .allMatch(emp -> emp.getSalary() > 0);
        System.out.println("\n✅ All employees have positive salary? " + allPositiveSalary);

    }

}