import java.util.Scanner;

public class Extraindo {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        String nomeDoArquivo = leitor.next();

        int posicaoPonto =  nomeDoArquivo.lastIndexOf(".");
        String nomeSemExtensao = nomeDoArquivo.substring(0, posicaoPonto);
        System.out.println(nomeSemExtensao);
    }
}