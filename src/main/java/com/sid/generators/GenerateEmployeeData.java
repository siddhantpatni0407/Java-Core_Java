package com.sid.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class GenerateEmployeeData {

    private static String generateRandomData(Integer headerValue) {
        Random random = new Random(2000);
        String[] firstName = {"John", "Alice", "Bob", "Sarah", "Michael", "Emma", "David", "Bill", "Olivia", "James", "Emily", "Mark"};
        String[] lastName = {"Smith", "Johnson", "Brown", "Jones", "Garcia", "Miller", "Davis", "Martinez", "Jackson", "Taylor", "Orig"};
        switch (headerValue) {
            case 1:
                return firstName[random.nextInt(firstName.length)];
            case 2:
                return lastName[random.nextInt(lastName.length)];
            case 3:
                String[] domain = {"gmail", "yahoo", "microsoft", "google"};
                String[] domainExtensions = {"com", "org", "net", "edu"};
                String randomExtension = domainExtensions[random.nextInt(domainExtensions.length)];
                String emailFirstName = firstName[random.nextInt(firstName.length)];
                String emailLastName = lastName[random.nextInt(firstName.length)];
                int randomNumber = random.nextInt(10000);
                String emailDomain = domain[random.nextInt(firstName.length)];
                return emailFirstName.toLowerCase() + "." + emailLastName.toLowerCase() + randomNumber + "@" + emailDomain + "." + randomExtension;
            case 4:
                String[] genderList = {"Male", "Female"};
                return genderList[random.nextInt(genderList.length)];
            case 5:
                // Generate the first digit to ensure it's between 1 and 9
                int firstDigit = random.nextInt(9) + 1;
                // Generate the remaining 9 digits
                StringBuilder contactNumberBuilder = new StringBuilder();
                contactNumberBuilder.append(firstDigit);
                for (int i = 0; i < 9; i++) {
                    contactNumberBuilder.append(random.nextInt(10));
                }
                return contactNumberBuilder.toString();
            case 6:
                String[] countryList = {"India", "United States", "Indonesia", "Greece", "Poland", "Finland", "Sweden", "Mauritius", "Russia", "Ireland"};
                return countryList[random.nextInt(countryList.length)];
            case 7:
                LocalDate startDate = LocalDate.of(1950, 1, 1); // Start date
                LocalDate endDate = LocalDate.now().minusYears(18); // End date (18 years ago from today)
                // Generate a random number of days between the start and end dates
                int randomDays = random.nextInt(startDate.until(endDate).getDays());
                // Add the random number of days to the start date to get a random date of birth
                LocalDate randomDate = startDate.plusDays(randomDays);
                // Format the random date of birth as a string in the format "yyyy-MM-dd"
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                return randomDate.format(formatter);
        }
        return "";
    }

    public static void main(String[] args) {
        String csvFile = "src/main/resources/customer.csv";

        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.append("id, firstName, lastName, email, gender, contactNo, country, dob\n");

            for (int i = 1; i <= 1000; i++) {
                String id = Integer.toString(i);
                String firstName = generateRandomData(1);
                String lastName = generateRandomData(2);
                String email = generateRandomData(3);
                String gender = generateRandomData(4);
                String contact = generateRandomData(5);
                String country = generateRandomData(6);
                String dob = generateRandomData(7);
                //String salary = Integer.toString(random.nextInt(70001) + 30000); // Random salary between 30000 and 100000

                writer.append(id)
                        .append(",")
                        .append(firstName)
                        .append(",")
                        .append(lastName)
                        .append(",")
                        .append(email)
                        .append(",")
                        .append(gender)
                        .append(",")
                        .append(contact)
                        .append(",")
                        .append(country)
                        .append(",")
                        .append(dob)
                        .append("\n");
            }

            System.out.println("Employee data has been generated and saved to " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}