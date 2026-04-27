import java.util.Scanner;

public class Substituindo {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = leitor.nextLine();

        System.out.println("Digite a palavra a ser substituida: ");
        String oldChar = leitor.next();

        if (!texto.contains(oldChar)){
            System.out.println("Palavra não encontrada.");
            return;
        }

        System.out.println("Digite a nova palavra: ");
        String replacement = leitor.next();


        String novoTexto = texto.replace(oldChar, replacement);
        System.out.println("Texto modificado: " + novoTexto);
    }
}