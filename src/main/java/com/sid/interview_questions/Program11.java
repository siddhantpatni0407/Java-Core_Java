/**
 * Java 21 program using Stream API to manage nested product and feature data.
 * <p>
 * Operations:
 * 1. Print products with model "iPhone 16"
 * 2. Find product-feature pair with the highest resolution
 * 3. Count of iPhone15 and iPhone16 by location
 * 4. Count all models by location
 * 5. Print unique models
 * 6. Average price of iPhone 16
 * 7. Top 3 features with highest resolution
 * 8. Product count by color
 * 9. Check if all products have at least one feature
 * 10. Most expensive product by location
 */
package com.sid.interview_questions;

import java.util.*;
import java.util.stream.*;

public class Program11 {

    // record for Feature
    record Feature(String picture, int resolution) {
    }

    // record for Product
    record Product(String model, String color, double price, String location, List<Feature> features) {
    }

    public static void main(String[] args) {
        // Sample nested product list
        List<List<Product>> productGroups = List.of(
                List.of(
                        new Product("iPhone 16", "Black", 1200, "NY", List.of(
                                new Feature("pic1.jpg", 1080), new Feature("pic2.jpg", 1440))),
                        new Product("iPhone 15", "White", 1000, "CA", List.of(
                                new Feature("pic3.jpg", 720)))
                ),
                List.of(
                        new Product("iPhone 16", "Red", 1250, "CA", List.of(
                                new Feature("pic4.jpg", 2160))),
                        new Product("iPhone 15", "Blue", 950, "NY", List.of(
                                new Feature("pic5.jpg", 1080))),
                        new Product("iPhone 14", "Black", 850, "TX", List.of(
                                new Feature("pic6.jpg", 720)))
                )
        );

        // Flatten list
        List<Product> products = productGroups.stream()
                .flatMap(List::stream)
                .toList();

        // 1. Products with model iPhone 16
        System.out.println("1. Products with model iPhone 16:");
        products.stream()
                .filter(p -> p.model().equalsIgnoreCase("iPhone 16"))
                .forEach(System.out::println);

        // 2. Product and Feature with Highest Resolution
        System.out.println("\n2. Product and Feature with Highest Resolution:");
        products.stream()
                .flatMap(p -> p.features().stream().map(f -> Map.entry(p, f)))
                .max(Comparator.comparingInt(entry -> entry.getValue().resolution()))
                .ifPresent(entry -> {
                    System.out.println("Product: " + entry.getKey());
                    System.out.println("Feature: " + entry.getValue());
                });

        // 3. iPhone15 & iPhone16 Count by Location
        System.out.println("\n3. iPhone15 & iPhone16 Count by Location:");
        products.stream()
                .filter(p -> p.model().equalsIgnoreCase("iPhone 15") || p.model().equalsIgnoreCase("iPhone 16"))
                .collect(Collectors.groupingBy(
                        Product::location,
                        Collectors.groupingBy(Product::model, Collectors.counting())
                ))
                .forEach((location, models) -> {
                    System.out.println("Location: " + location);
                    models.forEach((model, count) -> System.out.println("   " + model + " -> " + count));
                });

        // 4. All model count by location
        System.out.println("\n4. All Model Count by Location:");
        products.stream()
                .collect(Collectors.groupingBy(
                        Product::location,
                        Collectors.groupingBy(Product::model, Collectors.counting())
                ))
                .forEach((location, models) -> {
                    System.out.println("Location: " + location);
                    models.forEach((model, count) -> System.out.println("   " + model + " -> " + count));
                });

        // 5. Unique models
        System.out.println("\n5. Unique Models:");
        products.stream()
                .map(Product::model)
                .distinct()
                .forEach(System.out::println);

        // 6. Average price of iPhone 16
        System.out.println("\n6. Average Price of iPhone 16:");
        products.stream()
                .filter(p -> p.model().equalsIgnoreCase("iPhone 16"))
                .mapToDouble(Product::price)
                .average()
                .ifPresent(avg -> System.out.println("Average: $" + avg));

        // 7. Top 3 Features with Highest Resolution
        System.out.println("\n7. Top 3 Features with Highest Resolution:");
        products.stream()
                .flatMap(p -> p.features().stream())
                .sorted(Comparator.comparingInt(Feature::resolution).reversed())
                .limit(3)
                .forEach(System.out::println);

        // 8. Product count by color
        System.out.println("\n8. Product Count by Color:");
        products.stream()
                .collect(Collectors.groupingBy(Product::color, Collectors.counting()))
                .forEach((color, count) -> System.out.println(color + " -> " + count));

        // 9. Check if all products have at least one feature
        System.out.println("\n9. Do all products have at least one feature?");
        boolean allHaveFeatures = products.stream()
                .allMatch(p -> !p.features().isEmpty());
        System.out.println("All have features: " + allHaveFeatures);

        // 10. Most expensive product by location
        System.out.println("\n10. Most Expensive Product by Location:");
        products.stream()
                .collect(Collectors.groupingBy(
                        Product::location,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::price)),
                                Optional::get
                        )
                ))
                .forEach((location, product) ->
                        System.out.println(location + " -> " + product.model() + " ($" + product.price() + ")")
                );
    }

}