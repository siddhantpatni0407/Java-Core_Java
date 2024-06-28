/**
 * Problem statement - Write a program to perform various stream operations 5
 */
package com.sid.java8.features.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 *
 */
public class StreamOperations5 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Max", 18),
                new Person("Peter", 23),
                new Person("Pamela", 23),
                new Person("David", 12));

//	        test1(persons);
//	        test2(persons);
//	        test3(persons);
        test4(persons);
//	        test5(persons);
//	        test6(persons);
//	        test7(persons);
//	        test8(persons);
//			test9(persons);
//	        test10(persons);
//	        test11(persons);
//	        test12(persons);
//	        test13(persons);
//	        test14(persons);
        test15(persons);
    }

    private static void test1(List<Person> persons) {
        List<Person> filtered = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());

        System.out.println(filtered); // [Peter, Pamela]
    }

    private static void test2(List<Person> persons) {
        Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.age));

        personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

        // age 18: [Max]
        // age 23:[Peter, Pamela]
        // age 12:[David]
    }

    private static void test3(List<Person> persons) {
        Double averageAge = persons.stream().collect(Collectors.averagingInt(p -> p.age));

        System.out.println(averageAge); // 19.0
    }

    private static void test4(List<Person> persons) {
        IntSummaryStatistics ageSummary = persons.stream().collect(Collectors.summarizingInt(p -> p.age));

        System.out.println(ageSummary);
        // IntSummaryStatistics{count=4, sum=76, min=12, average=19,000000, max=23}
    }

    private static void test5(List<Person> persons) {
        String names = persons.stream().filter(p -> p.age >= 18).map(p -> p.name)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

        System.out.println(names);
        // In Germany Max and Peter and Pamela are of legal age.
    }

    private static void test6(List<Person> persons) {
        Map<Integer, String> map = persons.stream()
                .collect(Collectors.toMap(p -> p.age, p -> p.name, (name1, name2) -> name1 + ";" + name2));

        System.out.println(map);
        // {18=Max, 23=Peter;Pamela, 12=David}
    }

    private static void test7(List<Person> persons) {
        Collector<Person, StringJoiner, String> personNameCollector = Collector.of(() -> new StringJoiner(" | "), // supplier
                (j, p) -> j.add(p.name.toUpperCase()), // accumulator
                (j1, j2) -> j1.merge(j2), // combiner
                StringJoiner::toString); // finisher

        String names = persons.stream().collect(personNameCollector);

        System.out.println(names); // MAX | PETER | PAMELA | DAVID
    }

    private static void test8(List<Person> persons) {
        Collector<Person, StringJoiner, String> personNameCollector = Collector.of(() -> {
            System.out.println("supplier");
            return new StringJoiner(" | ");
        }, (j, p) -> {
            System.out.format("accumulator: p=%s; j=%s\n", p, j);
            j.add(p.name.toUpperCase());
        }, (j1, j2) -> {
            System.out.println("merge");
            return j1.merge(j2);
        }, j -> {
            System.out.println("finisher");
            return j.toString();
        });

        String names = persons.stream().collect(personNameCollector);

        System.out.println(names); // MAX | PETER | PAMELA | DAVID
    }

    private static void test9(List<Person> persons) {
        Collector<Person, StringJoiner, String> personNameCollector = Collector.of(() -> {
            System.out.println("supplier");
            return new StringJoiner(" | ");
        }, (j, p) -> {
            System.out.format("accumulator: p=%s; j=%s\n", p, j);
            j.add(p.name.toUpperCase());
        }, (j1, j2) -> {
            System.out.println("merge");
            return j1.merge(j2);
        }, j -> {
            System.out.println("finisher");
            return j.toString();
        });

        String names = persons.parallelStream().collect(personNameCollector);

        System.out.println(names); // MAX | PETER | PAMELA | DAVID
    }

    private static void test10(List<Person> persons) {
        persons
                .stream()
                .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
                .ifPresent(System.out::println);    // Pamela
    }

    private static void test11(List<Person> persons) {
        Person result =
                persons
                        .stream()
                        .reduce(new Person("", 0), (p1, p2) -> {
                            p1.age += p2.age;
                            p1.name += p2.name;
                            return p1;
                        });

        System.out.format("name=%s; age=%s", result.name, result.age);
    }

    private static void test12(List<Person> persons) {
        Integer ageSum = persons
                .stream()
                .reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);

        System.out.println(ageSum);
    }

    private static void test13(List<Person> persons) {
        Integer ageSum = persons
                .stream()
                .reduce(0,
                        (sum, p) -> {
                            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
                            return sum += p.age;
                        },
                        (sum1, sum2) -> {
                            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
                            return sum1 + sum2;
                        });

        System.out.println(ageSum);
    }

    private static void test14(List<Person> persons) {
        Integer ageSum = persons
                .parallelStream()
                .reduce(0,
                        (sum, p) -> {
                            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
                            return sum += p.age;
                        },
                        (sum1, sum2) -> {
                            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
                            return sum1 + sum2;
                        });

        System.out.println(ageSum);
    }

    private static void test15(List<Person> persons) {
        Integer ageSum = persons
                .parallelStream()
                .reduce(0,
                        (sum, p) -> {
                            System.out.format("accumulator: sum=%s; person=%s; thread=%s\n",
                                    sum, p, Thread.currentThread().getName());
                            return sum += p.age;
                        },
                        (sum1, sum2) -> {
                            System.out.format("combiner: sum1=%s; sum2=%s; thread=%s\n",
                                    sum1, sum2, Thread.currentThread().getName());
                            return sum1 + sum2;
                        });

        System.out.println(ageSum);
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}