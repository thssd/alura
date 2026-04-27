import java.util.Scanner;

public class RemoveEspaco {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nomeComEspaco = leitor.nextLine();

        String nomeFormatado = nomeComEspaco.trim();
        System.out.println(nomeFormatado);
        leitor.close();
    }
}
