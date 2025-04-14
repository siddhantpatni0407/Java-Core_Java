package com.sid.collection_framework.map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo6 {


    public static void main(String[] args) {
        @Data
        @AllArgsConstructor
        class Student {
            int id;
            String name;
        }

        List<Student> students = Arrays.asList(
                new Student(101, "Alice"),
                new Student(102, "Bob"),
                new Student(103, "Charlie")
        );

        Map<Integer, String> studentMap = students.stream()
                .collect(Collectors.toMap(s -> s.id, s -> s.name));

        System.out.println(studentMap); // {101=Alice, 102=Bob, 103=Charlie}

    }

}