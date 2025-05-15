package com.sid.file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Siddhant Patni
 */
public class FileReadWrite {

    // Method to write data to a file at a specified location
    public static void writeToFile(String filePath, String data) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(data);
            System.out.println("Data written successfully to: " + filePath);
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + e.getMessage());
        } finally {
            // Ensure resources are closed in the finally block
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("Error while closing the writer: " + e.getMessage());
                }
            }
        }
    }

    // Method to read data from the specified file
    public static void readFromFile(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("Reading data from: " + filePath);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error while reading from file: " + e.getMessage());
        } finally {
            // Ensure resources are closed in the finally block
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error while closing the reader: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Specify file path and data
        String filePath = "C:\\Users\\Siddhant Patni\\Downloads\\file.txt";
        String data = "Hello, Siddhant!\nWelcome to File Operations in Java.\nHave a great day!";

        // Call methods to write and read data
        writeToFile(filePath, data);
        readFromFile(filePath);
    }

}