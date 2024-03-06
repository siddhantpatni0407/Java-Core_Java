/**
 * Problem statement - Write a java program to perform various operations with Comparable and Comparator
 */
package com.sid.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Siddhant Patni
 *
 */
public class MainClassComparableAndComparator {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(11, "Siddhant"));
        employees.add(new Employee(53, "Piyush"));
        employees.add(new Employee(13, "Dinesh"));
        employees.add(new Employee(76, "Saneesh"));
        employees.add(new Employee(22, "Shivaraj"));
        employees.add(new Employee(22, "Bharath"));
        employees.add(new Employee(12, "Shivaraj"));

        Collections.sort(employees);

        // Collections.sort(employees, new SortByNameThenId());

        // Using anonymous class
        /*
         * Collections.sort(employees, new Comparator<Employee>() {
         *
         * @Override public int compare(Employee e1, Employee e2) {
         * if(e1.employeeName.equals(e2.employeeName)) { return e1.employeeId -
         * e2.employeeId; } else { return e1.employeeName.compareTo(e2.employeeName); }
         * }
         *
         * });
         */

        // Using Lambda expression
		/*
		Collections.sort(employees, (e1, e2) -> {
			if (e1.employeeName.equals(e2.employeeName)) {
				return e1.employeeId - e2.employeeId;
			} else {
				return e1.employeeName.compareTo(e2.employeeName);
			}
		});
		*/

        // Sort on the basis of employee name
        // Collections.sort(employees,(e1, e2) ->
        // e1.employeeName.compareTo(e2.employeeName));

        // Sort by employee name then employee id
        //Collections.sort(employees, Comparator.comparing(Employee::getEmployeeName).thenComparing(Employee::getEmployeeId));

        // Sort by employee name then employee id and then do reverse
        //Collections.sort(employees, Comparator.comparing(Employee::getEmployeeName).thenComparing(Employee::getEmployeeId).reversed());
        employees.forEach(System.out::println);
    }
}

class SortByNameThenId implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.employeeName.equals(e2.employeeName)) {
            return e1.employeeId - e2.employeeId;
        } else {
            return e1.employeeName.compareTo(e2.employeeName);
        }
    }
}