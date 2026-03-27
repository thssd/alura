import java.util.Scanner;

public class CalculoDeArea {
    static void main() {
        Scanner leitor = new Scanner (System.in);
        System.out.println("[1] para calcular a área de um quadrado.");
        System.out.println("[2] para calcular a área de um circulo.");
        int resposta = leitor.nextInt();

        if (resposta == 1){
            System.out.println("Qual o comprimento do lado do quadrado?");
            int quadrado = leitor.nextInt();
            System.out.println("A área do quadrado é igual a: " + quadrado * quadrado);
        }
        if (resposta == 2){
            System.out.println("Qual o comprimento do raio do ciruclo?");
            int circulo = leitor.nextInt();
            double resultado = 3.14 * (circulo * circulo);
            System.out.println("A área do ciruclo é igual a: " + resultado);
        }
    }
}
