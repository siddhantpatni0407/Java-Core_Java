package com.sid.java8.features.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author Siddhant Patni
 */
public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(String::toUpperCase)
                .thenAccept(System.out::println);
    }
}