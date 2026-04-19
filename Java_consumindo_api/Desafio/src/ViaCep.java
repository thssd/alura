import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Scanner;

public class ViaCep {
    static void main() throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        String cep = "";

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        while (!cep.equalsIgnoreCase("sair")) {

            try {
                System.out.println("Digite um número de CEP para consulta. Ou 'sair' para finalizar:");
                ConsultaCep consultaCep = new ConsultaCep();
                consultaCep.retornaCep(cep = leitor.nextLine());

                Endereco endereco = gson.fromJson(consultaCep.retornaCep(cep), Endereco.class);
                System.out.println(consultaCep.retornaCep(cep));

                SalvadorEndereco salvadorEndereco = new SalvadorEndereco();
                salvadorEndereco.salvaArquivo(endereco);

            } catch (JsonSyntaxException e){
                if (cep.equalsIgnoreCase("sair")){
                    System.out.println("Finalizando.");
                    break;
                }
                System.out.println("CEP inválido.");
            }
        }
    }
}
