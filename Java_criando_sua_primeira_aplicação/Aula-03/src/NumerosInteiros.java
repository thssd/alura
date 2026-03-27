import java.util.Scanner;

public class NumerosInteiros {
    static void main() {
        Scanner leitor = new Scanner (System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = leitor.nextInt();

        if (n1 == n2){
            System.out.println("Os números são IGUAIS.");
        } else {
            System.out.println("Os números são DIFERENTES.");
        }
        if (n1 > n2){
            System.out.println("O PRIMEIRO número é MAIOR que o segundo.");
        } if (n2 > n1) {
            System.out.println("O SEGUNDO número é MAIOR que o primeiro.");
        }
    }
}
