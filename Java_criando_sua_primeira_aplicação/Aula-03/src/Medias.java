import java.util.Scanner;

public class Medias {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double media = 0;

        for (int i = 1; i < 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            nota = scanner.nextDouble();
            media += nota;
        }
        System.out.println("Sua média final foi de: " + media / 3 );
    }
}
