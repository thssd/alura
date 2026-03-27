import java.util.Scanner;

public class Desafio {
    static void main() {
        Scanner leitor = new Scanner (System.in);

        System.out.print("Digite qualquer número: ");
        int numeroDigitado = leitor.nextInt();

        if (numeroDigitado < 0){
            System.out.println("O número que você digitou é negativo.");
        } else{
            System.out.println("O número que você digitou é positivo.");
        }
    }
}
