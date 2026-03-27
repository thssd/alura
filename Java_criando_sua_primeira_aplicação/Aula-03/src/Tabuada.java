import java.util.Scanner;

public class Tabuada {
    static void main() {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Qual o número da tabuada você deseja?");
        int numero = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
