import java.util.Scanner;

public class Termina5 {
    static void main() {
        Scanner leitor = new Scanner (System.in);

        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 10 == 5){
                continue;
            }
            System.out.print("\n " + i);
        }
    }
}
