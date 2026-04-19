package br.com.alura.sreenmatch.principal;

import br.com.alura.screematch.excecoes.YearConvertionErrorException;
import br.com.alura.screematch.model.Titulo;
import br.com.alura.screematch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsumindoAPI {
    static void main() throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        String busca = "";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        List<Titulo> listaDeTitulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")) {

            if (busca.equalsIgnoreCase("sair")){
                break;
            }

            System.out.println("Digite um filme: ");
            busca = leitor.nextLine();

            try {
                var endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=2bf588d1";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("TITULO JÁ CONVERTIDO");
                System.out.println(meuTitulo);

                listaDeTitulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro no endereço: " + e.getMessage());
            } catch (YearConvertionErrorException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(listaDeTitulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(listaDeTitulos));
        escrita.close();

        System.out.println("O programa rodou corretamente");
    }
}
