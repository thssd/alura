import java.util.Scanner;

public class VerificaTexto {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = leitor.nextLine();

        System.out.println("Digite uma palavra: ");
        String palavra = leitor.next();

        if (frase.contains(palavra)){
            System.out.printf("A palavra '%s' está presente no texto", palavra);
        } else {
            System.out.printf("A palavra '%s' não está presente no texto", palavra);
        }
    }
}
