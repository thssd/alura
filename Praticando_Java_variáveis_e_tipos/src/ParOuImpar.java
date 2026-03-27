import java.util.Scanner;

public class ParOuImpar {
    static void main() {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite um número");
        int numero = leitor.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número digitado é PAR.");
        } else {
            System.out.println("O número digitado é IMPAR.");
        }
    }
}
