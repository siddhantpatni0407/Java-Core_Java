/**
 * Using Java records and Jackson to handle nested JSON structures.
 */

package com.sid.java21.features;

import com.fasterxml.jackson.databind.ObjectMapper;

record Address(String city, String country) {
}

record Person(String name, int age, Address address) {
}

/**
 * @author Siddhant Patni
 */
public class JSONToRecordExample {
    public static void main(String[] args) throws Exception {
        String json = """
                {
                    "name": "Alice",
                    "age": 30,
                    "address": {
                        "city": "New York",
                        "country": "USA"
                    }
                }
                """;

        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);

        System.out.println("Name: " + person.name());
        System.out.println("City: " + person.address().city());
    }
}