import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CotacaoMoeda {
    static void main() throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite umca CriptoMoeda:");
        var busca = leitor.nextLine();

        var endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=" + busca + "&x_cg_demo_api_key=CG-tP3EEh7k3jZQiYL2vwBG2h9T";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
