import java.util.Scanner;

public class Divisao {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        try {
            double divisao = num1 / num2;
            System.out.println("Resultado: " + divisao);
        } catch (Exception e) {
            System.out.println("Aconteceu uma exceção: " + e.getMessage());
        }
    }
}
