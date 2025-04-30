/**
 * Sort a list of Employee objects first by employee name (alphabetically), and then by date of birth (DOB) using Java Stream API.
 */
package com.sid.interview_questions;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
class Employees {
    private int empId;
    private String name;
    private LocalDate dob;
    private LocalDate doj;
    private String project;

    // Constructor
    public Employees(int empId, String name, LocalDate dob, LocalDate doj, String project) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
        this.project = project;
    }

    // Getters
    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", doj=" + doj +
                ", project='" + project + '\'' +
                '}';
    }
}

public class Program25 {

    public static void main(String[] args) {

        List<Employees> employees = Arrays.asList(
                new Employees(101, "Alice", LocalDate.of(1990, 5, 21), LocalDate.of(2020, 3, 1), "Project A"),
                new Employees(102, "Bob", LocalDate.of(1989, 7, 10), LocalDate.of(2019, 8, 15), "Project B"),
                new Employees(103, "Alice", LocalDate.of(1985, 12, 11), LocalDate.of(2018, 1, 5), "Project C"),
                new Employees(104, "David", LocalDate.of(1992, 4, 30), LocalDate.of(2021, 6, 20), "Project D")
        );

        // Sort by name, then by DOB
        List<Employees> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employees::getName)
                        .thenComparing(Employees::getDob))
                .collect(Collectors.toList());

        // Output
        sortedEmployees.forEach(System.out::println);
    }

}