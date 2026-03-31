import java.util.Scanner;

public class Degraus {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int degraus = leitor.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");
    }
}
