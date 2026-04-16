package br.com.alura.sreenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsumindoAPI {
    static void main() throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um filme: ");
        var busca = leitor.nextLine();

        var endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=2bf588d1";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
