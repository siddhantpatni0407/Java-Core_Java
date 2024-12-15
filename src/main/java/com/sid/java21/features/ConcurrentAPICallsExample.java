/**
 * Simultaneously fetching data from multiple sources with structured concurrency.
 */

/*
package com.sid.java21.features;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.Future;
import java.util.concurrent.StructuredTaskScope;

*/
/**
 * @author Siddhant Patni
 *//*

public class ConcurrentAPICallsExample {
    public static void main(String[] args) {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<String> api1 = scope.fork(() -> fetchData("https://jsonplaceholder.typicode.com/posts/1"));
            Future<String> api2 = scope.fork(() -> fetchData("https://jsonplaceholder.typicode.com/posts/2"));

            scope.join();
            scope.throwIfFailed();

            System.out.println("API 1 Response: " + api1.resultNow());
            System.out.println("API 2 Response: " + api2.resultNow());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String fetchData(String url) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        return client.send(request, HttpResponse.BodyHandlers.ofString()).body();
    }
}*/
