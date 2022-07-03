package com.httpexamples;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;

public class getRequest {

    public static final String URL_GET = "";

    public static void main (String[] args) throws IOException, InterruptedException {

        //cliente HTTP
        HttpClient httpClient = HttpClient.newHttpClient();

        //criar a requisição
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create())
                .build();
    }

}
