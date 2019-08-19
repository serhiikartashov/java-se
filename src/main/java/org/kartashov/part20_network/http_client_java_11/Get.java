package org.kartashov.part20_network.http_client_java_11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Get {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://openjdk.java.net/"))
                .GET()
                .header("User-Agent", "Java 11")
                .build();


        // sync
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                System.out.println(response.body());
            } else {
                System.out.println("Something wrong here!");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        // async
        client.sendAsync(request,
                responseInfo -> responseInfo.statusCode() == 200 ?
                        HttpResponse.BodySubscribers.ofString(UTF_8) :
                        HttpResponse.BodySubscribers.replacing("Something wrong here!"))
                .thenApply(HttpResponse::body)
                .exceptionally(throwable -> "Something wrong here!")
                .thenAccept(System.out::println);

//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();
    }
}
