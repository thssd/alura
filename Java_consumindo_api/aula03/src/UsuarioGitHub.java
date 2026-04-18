import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class UsuarioGitHub {
    static void main() throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = leitor.nextLine();

        var endereco = "https://api.github.com/users/" + nome;

        try{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 404){
            throw new ErroConsultaGitHubException("Usuário não encontrado.");
        }

            System.out.println(response.body());

        } catch (ErroConsultaGitHubException e){
            System.out.println("Imprevisto: " + e.getMessage());
        }

    }
}
