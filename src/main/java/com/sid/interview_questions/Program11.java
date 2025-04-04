/**
 * Java program to manage product and feature data using Java 8 Stream API.
 * <p>
 * Operations performed:
 * 1. Print all products with model "iPhone 16"
 * 2. Get the product and its feature with the highest resolution
 * 3. Count of iPhone15 and iPhone16 in each location
 * 4. Count of all models grouped by location
 */
package com.sid.interview_questions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;
import java.util.stream.*;

/**
 * Main class to execute product stream operations.
 *
 * Author: Siddhant Patni
 */
public class Program11 {

    /**
     * Represents a product feature with a picture and resolution.
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    static class Feature {
        private String picture;
        private int resolution;
    }

    /**
     * Represents a product with model, color, price, location, and a list of features.
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    static class Product {
        private String model;
        private String color;
        private double price;
        private String location;
        private List<Feature> features;
    }

    public static void main(String[] args) {
        // Sample data
        List<Product> products = Arrays.asList(
                new Product("iPhone 16", "Black", 1200, "NY", Arrays.asList(
                        new Feature("pic1.jpg", 1080), new Feature("pic2.jpg", 1440))),
                new Product("iPhone 15", "White", 1000, "CA", Arrays.asList(
                        new Feature("pic3.jpg", 720))),
                new Product("iPhone 16", "Red", 1250, "CA", Arrays.asList(
                        new Feature("pic4.jpg", 2160))),
                new Product("iPhone 15", "Blue", 950, "NY", Arrays.asList(
                        new Feature("pic5.jpg", 1080)))
        );

        // 1. Print products with model = iPhone 16
        System.out.println("1. Products with model iPhone 16:");
        products.stream()
                .filter(p -> "iPhone 16".equalsIgnoreCase(p.getModel()))
                .forEach(System.out::println);

        // 2. Get the product and its feature which has highest resolution
        System.out.println("\n2. Product and Feature with Highest Resolution:");
        products.stream()
                .flatMap(product -> product.getFeatures().stream()
                        .map(feature -> new AbstractMap.SimpleEntry<>(product, feature)))
                .max(Comparator.comparingInt(entry -> entry.getValue().getResolution()))
                .ifPresent(entry -> {
                    System.out.println("Product: " + entry.getKey());
                    System.out.println("Feature: " + entry.getValue());
                });

        // 3. Count of iPhone15 and iPhone16 in each location
        System.out.println("\n3. iPhone 15 & iPhone 16 Count by Location:");
        products.stream()
                .filter(p -> p.getModel().equalsIgnoreCase("iPhone 15") || p.getModel().equalsIgnoreCase("iPhone 16"))
                .collect(Collectors.groupingBy(
                        Product::getLocation,
                        Collectors.groupingBy(
                                Product::getModel,
                                Collectors.counting()
                        )
                ))
                .forEach((location, modelMap) -> {
                    System.out.println("Location: " + location);
                    modelMap.forEach((model, count) ->
                            System.out.println("   " + model + " -> " + count));
                });

        // 4. Count of all models grouped by location
        System.out.println("\n4. Model count by location:");
        products.stream()
                .collect(Collectors.groupingBy(
                        Product::getLocation,
                        Collectors.groupingBy(
                                Product::getModel,
                                Collectors.counting()
                        )
                ))
                .forEach((location, modelMap) -> {
                    System.out.println("Location: " + location);
                    modelMap.forEach((model, count) ->
                            System.out.println("   " + model + " -> " + count));
                });
    }

}