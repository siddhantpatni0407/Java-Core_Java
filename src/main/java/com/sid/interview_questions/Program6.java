/**
 * Problem Statement
 * You are given a list of students, where each student has a name, an exam subject, and a grade. The goal is to identify the top-performing students based on their grades and return the results in different formats.
 * <p>
 * Requirements
 * Implement the following three methods:
 * <p>
 * getTopperList1(List<StudentRecord> records) → Map<String, StudentRecord>
 * <p>
 * Finds all students who achieved the highest grade in the list.
 * Returns a Map where:
 * Key → Student’s name.
 * Value → Corresponding StudentRecord object.
 * stringifyExamToppers(Map<String, StudentRecord> toppersList) → String
 * <p>
 * Converts the topper list into a human-readable string format.
 * If no toppers exist, it returns "No toppers found."
 * findTopper(List<StudentRecord> records) → String
 * <p>
 * Finds one student with the highest grade.
 * Returns only their name.
 * If multiple students have the highest grade, it can return any one of them.
 * If the list is empty, it returns "No topper found".
 * 📌 Input & Output Example
 * Input: List of Students
 * plaintext
 * Copy
 * Edit
 * Alice   | Math       | 95
 * Bob     | Physics    | 89
 * Charlie | Chemistry  | 92
 * David   | Biology    | 88
 * Eve     | Math       | 95
 * Frank   | Physics    | 85
 */

package com.sid.interview_questions;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class Program6 {

    public static class StudentRecord {
        String name;
        String exam;
        int grade;

        public StudentRecord(String name, String exam, int grade) {
            this.name = name;
            this.exam = exam;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name + " | " + exam + " | " + grade;
        }
    }

    // ✅ Method to find toppers using Streams
    public static Map<String, StudentRecord> getTopperList1(List<StudentRecord> records) {
        // Find max grade
        int maxGrade = records
                .stream()
                .mapToInt(s -> s.grade)
                .max()
                .orElse(Integer.MIN_VALUE); // Handle empty list case

        // Filter students with max grade and collect to Map
        return records
                .stream()
                .filter(s -> s.grade == maxGrade)
                .collect(Collectors.toMap(s -> s.name, s -> s));
    }

    public static Map<String, StudentRecord> getTopperList2(List<StudentRecord> records) {
        if (records == null || records.isEmpty()) {
            return Collections.emptyMap();
        }

        // Group students by grade and store in a sorted map (TreeMap)
        TreeMap<Integer, Map<String, StudentRecord>> sortedByGrade = records.stream()
                .collect(Collectors.groupingBy(
                        s -> s.grade,                 // Group by grade
                        TreeMap::new,                 // Keep grades sorted in ascending order
                        Collectors.toMap(
                                s -> s.name,              // Key: Student name
                                s -> s,                   // Value: StudentRecord
                                (existing, replacement) -> existing // Handle duplicate names
                        )
                ));

        // Get the last (highest) entry in the sorted map
        Map.Entry<Integer, Map<String, StudentRecord>> highestEntry = sortedByGrade.lastEntry();

        // Return the map of toppers, or an empty map if no data exists
        return highestEntry != null ? highestEntry.getValue() : Collections.emptyMap();
    }

    // ✅ Method to stringify the topper list using Streams
    public static String stringifyExamToppers(Map<String, StudentRecord> toppersList) {
        return toppersList
                .isEmpty() ? "No toppers found." : toppersList.entrySet()
                .stream()
                .map(entry -> entry.getKey() + " -> " + entry.getValue().toString())
                .collect(Collectors.joining("\n", "Topper List:\n", ""));
    }

    // ✅ Method to find one topper’s name using Streams
    public static String findTopper(List<StudentRecord> records) {
        return records
                .stream()
                .max(Comparator.comparingInt(s -> s.grade))
                .map(s -> s.name)
                .orElse("No topper found");
    }

    public static void main(String[] args) {
        // Test Cases
        List<StudentRecord> students = Arrays.asList(
                new StudentRecord("Alice", "Math", 95),
                new StudentRecord("Bob", "Physics", 89),
                new StudentRecord("Charlie", "Chemistry", 92),
                new StudentRecord("David", "Biology", 88),
                new StudentRecord("Eve", "Math", 95),
                new StudentRecord("Frank", "Physics", 85)
        );

        // Find and print the topper list
        Map<String, StudentRecord> topperList = getTopperList1(students);
        System.out.println(stringifyExamToppers(topperList));

        // Find and print the name of the topper
        System.out.println("Topper: " + findTopper(students));
    }

}