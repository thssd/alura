import java.util.Scanner;

public class Fatorial {
    static void main() {
        Scanner leitor = new Scanner (System.in);
        int fatorial = 1;

        System.out.println("Digite o número que deseja fatorar");
        int numero = leitor.nextInt();

        for (int i = 1; i <= numero; i++) {
           fatorial *= i;
            System.out.println(fatorial);
        }
    }
}
