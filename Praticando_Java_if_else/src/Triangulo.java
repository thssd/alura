import java.util.Scanner;

public class Triangulo {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro lado");
        int l1 = leitor.nextInt();
        System.out.println("Digite o segundo lado");
        int l2 = leitor.nextInt();
        System.out.println("Digite o terceiro lado");
        int l3 = leitor.nextInt();

        if (l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
        leitor.close();
    }
}
