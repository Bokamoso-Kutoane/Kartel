package com.bok.f1tracker.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author bok
 */
public class OpenF1Client {
    public static void pingAPI() {
        try {
            System.out.println("Contacting OpenF1...");

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.openf1.org/v1/drivers?driver_number=1"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Raw JSON Data: " + response.body());
        } catch (Exception e) {
            System.out.println("Something went wrong lowkey");
            e.printStackTrace();
        }
    }
}
