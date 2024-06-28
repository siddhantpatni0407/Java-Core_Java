package com.sid.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

public class GenerateCustomerData {

    public static void main(String[] args) {
        String csvFile = "src/main/resources/siddhant.csv";

        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.append("id,firstName,lastName,email,gender,contactNo,country,dob\n");

            for (int i = 1; i <= 1000; i++) {
                String id = Integer.toString(i);
                String firstName = generateRandomName();
                String lastName = generateRandomName();
                String email = generateRandomEmail(firstName, lastName);
                String gender = generateRandomGender();
                String contactNo = generateRandomContactNumber();
                String country = generateRandomCountry();
                String dob = generateRandomDateOfBirth().toString();

                writer.append(id).append(",")
                        .append(firstName).append(",")
                        .append(lastName).append(",")
                        .append(email).append(",")
                        .append(gender).append(",")
                        .append(contactNo).append(",")
                        .append(country).append(",")
                        .append(dob).append("\n");
            }

            System.out.println("Customer data has been generated and saved to " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateRandomName() {
        String[] names = {"John", "Alice", "Bob", "Sarah", "Michael", "Emma", "David", "Olivia", "James", "Emily"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    private static String generateRandomEmail(String firstName, String lastName) {
        Random random = new Random();
        String[] domains = {"example.com", "test.com", "company.com", "mail.com", "gmail.com"};
        String domain = domains[random.nextInt(domains.length)];
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain;
    }

    private static String generateRandomGender() {
        Random random = new Random();
        return random.nextBoolean() ? "Male" : "Female";
    }

    private static String generateRandomContactNumber() {
        Random random = new Random();
        int firstDigit = random.nextInt(9) + 1;
        StringBuilder contactNumberBuilder = new StringBuilder().append(firstDigit);
        for (int i = 0; i < 9; i++) {
            contactNumberBuilder.append(random.nextInt(10));
        }
        return contactNumberBuilder.toString();
    }

    private static String generateRandomCountry() {
        String[] countries = {"USA", "UK", "Canada", "Australia", "Germany", "France", "India", "Japan", "China", "Brazil"};
        Random random = new Random();
        return countries[random.nextInt(countries.length)];
    }

    private static LocalDate generateRandomDateOfBirth() {
        Random random = new Random();
        LocalDate startDate = LocalDate.of(1950, 1, 1); // Start date
        LocalDate endDate = LocalDate.now().minusYears(18); // End date (18 years ago from today)
        int randomDays = random.nextInt(startDate.until(endDate).getDays());
        return startDate.plusDays(randomDays);
    }

}