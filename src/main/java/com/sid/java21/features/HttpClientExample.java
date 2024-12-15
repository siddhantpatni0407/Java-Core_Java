/**
 * HttpClient now supports request/response body handlers with InputStream.
 */

package com.sid.java21.features;

import java.net.http.*;
import java.net.URI;

/**
 * @author Siddhant Patni
 */
public class HttpClientExample {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .build();

        String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        System.out.println(response);
    }
}