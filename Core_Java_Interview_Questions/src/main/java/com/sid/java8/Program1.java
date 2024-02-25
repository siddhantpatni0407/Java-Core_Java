package com.sid.java8;

import com.sid.model.Student;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program1 {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Bangalore", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Bangalore", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Bangalore", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Bangalore", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        // 1. Find the list of students whose rank is in between 50 and 100

        System.out.println("****************************************************************");
        System.out.println("Q. Find the list of students whose rank is in between 50 and 100");
        System.out.println("****************************************************************");
        List<Student> studentByRank = studentList
                .stream()
                .filter(student -> student.getRank() > 50 && student.getRank() < 100)
                .collect(Collectors.toList());

        studentByRank.forEach(System.out::println);
        System.out.println("****************************************************************");

        //2. Find the Students who stays in Bangalore and sort them by their names

        System.out.println("****************************************************************");
        System.out.println("Q. Find the Students who stays in Bangalore and sort them by their names");
        System.out.println("****************************************************************");
        List<Student> studentByCity = studentList
                .stream()
                .filter(student -> student.getCity().equals("Bangalore"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList());

        studentByCity.forEach(System.out::println);
        System.out.println("****************************************************************");

        //3. Find the Students who stays in Bangalore and sort them by their names in reverse order

        System.out.println("****************************************************************");
        System.out.println("Q. Find the Students who stays in Bangalore and sort them by their names in reverse order");
        System.out.println("****************************************************************");
        List<Student> studentByCityAndSort = studentList
                .stream()
                .filter(student -> student.getCity().equals("Bangalore"))
                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        studentByCityAndSort.forEach(System.out::println);
        System.out.println("****************************************************************");

        //4. Find all departments names

        System.out.println("****************************************************************");
        System.out.println("Q. Find all departments names");
        System.out.println("****************************************************************");
        List<String> deptNames = studentList
                .stream()
                .map(Student::getDept)
                .collect(Collectors.toList());

        deptNames.forEach(System.out::println);
        System.out.println("****************************************************************");

        //5. Find all unique departments names - approach 1

        System.out.println("****************************************************************");
        System.out.println("Q.  Find all unique departments names - approach 1");
        System.out.println("****************************************************************");
        List<String> uniqueDeptNames1 = studentList
                .stream()
                .map(Student::getDept)
                .distinct()
                .collect(Collectors.toList());

        uniqueDeptNames1.forEach(System.out::println);
        System.out.println("****************************************************************");

        //6. Find all unique departments names - approach 2

        System.out.println("****************************************************************");
        System.out.println("Q.  Find all unique departments names - approach 2");
        System.out.println("****************************************************************");
        Set<String> uniqueDeptNames2 = studentList
                .stream()
                .map(Student::getDept)
                .collect(Collectors.toSet());

        uniqueDeptNames2.forEach(System.out::println);
        System.out.println("****************************************************************");

        //7.  Find all the contact numbers

        System.out.println("****************************************************************");
        System.out.println("Q.  Find all the contact numbers");
        System.out.println("****************************************************************");
        List<String> contacts = studentList
                .stream()
                .flatMap(student -> student.getContacts().stream())
                .collect(Collectors.toList());
        System.out.println(contacts);
        //one2one-> map
        //one2many-> flatmap
        System.out.println("****************************************************************");

        //8.  Find all the unique contact numbers

        System.out.println("****************************************************************");
        System.out.println("Q.  Find all the unique contact numbers");
        System.out.println("****************************************************************");
        List<String> uniqueContacts = studentList
                .stream()
                .flatMap(student -> student.getContacts().stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueContacts);
        System.out.println("****************************************************************");

        //9. Group The Student By Department Names

        System.out.println("****************************************************************");
        System.out.println("Q. Group The Student By Department Names");
        System.out.println("****************************************************************");
        Map<String, List<Student>> studentMap = studentList
                .stream()
                .collect(Collectors.groupingBy(Student::getDept));
        System.out.println(studentMap);
        System.out.println("****************************************************************");

        //10. Find the department who is having maximum number of students

        System.out.println("****************************************************************");
        System.out.println("Q. Find the department who is having maximum number of students");
        System.out.println("****************************************************************");
        Map.Entry<String, Long> results = studentList
                .stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(results);
        System.out.println("****************************************************************");

        //11. Find the average age of male and female students

        System.out.println("****************************************************************");
        System.out.println("Q. Find the average age of male and female students");
        System.out.println("****************************************************************");
        Map<String, Double> avgStudents = studentList
                .stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));

        System.out.println(avgStudents);
        System.out.println("****************************************************************");

        //12. Find the highest rank in each department

        System.out.println("****************************************************************");
        System.out.println("Q. Find the highest rank in each department");
        System.out.println("****************************************************************");
        Map<String, Optional<Student>> stdMap = studentList
                .stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(stdMap);
        System.out.println("****************************************************************");

        //13. Find the student who has second rank

        System.out.println("****************************************************************");
        System.out.println("Q. Find the student who has second rank");
        System.out.println("****************************************************************");
        Student student = studentList
                .stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(2)
                .findFirst()
                .get();
        System.out.println(student);
        System.out.println("****************************************************************");

    }

}