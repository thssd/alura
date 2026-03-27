import java.util.Random;
import java.util.Scanner;

public class Adivinhação {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        System.out.println("TENTE ACERTAR O NÚMERO PREMIADO DE O À 100!");

        while (tentativas < 5) {
            System.out.print("Escolha um número: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns você acertou o número premiado!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número premiado é MAIOR do que isso.");
            } else {
                System.out.println("O número premiado é MENOR do que isso.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Suas tentativas acabaram. O número premiado é: " + numeroGerado);
        }
    }
}