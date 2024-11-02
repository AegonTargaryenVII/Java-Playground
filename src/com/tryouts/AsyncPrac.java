package com.tryouts;

import java.net.URI;
import java.net.http.*;

public class AsyncPrac {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/getdummy")).GET().build();

        while(0<1){
            try {
                HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    System.out.println("Response content: " + response.body());
                } else {
                    System.out.println("GET request failed. Status Code: " + response.statusCode());
                }

            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
}
