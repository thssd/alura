import java.util.Scanner;

public class Convertendo {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a frase: ");
        String frase = leitor.nextLine();

        String fraseMaiuscula = frase.toUpperCase();
        String fraseMinuscula = frase.toLowerCase();

        System.out.println(fraseMaiuscula);
        System.out.println(fraseMinuscula);
    }
}
