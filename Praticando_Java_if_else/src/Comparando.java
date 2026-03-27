import java.util.Scanner;

public class Comparando {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int primeiro = leitor.nextInt();
        System.out.println("Digite o segundo número");
        int segundo = leitor.nextInt();

        if (primeiro == segundo){
            System.out.println("Os números são iguais.");
        } else if (primeiro > segundo){
            System.out.println("O maior número é o " + primeiro);
        } else {
            System.out.println("O maior número é o " + segundo);
        }
    }
}
