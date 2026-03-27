import java.util.Scanner;

public class Reprovado {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = leitor.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.printf("O estudante teve média %.1f e foi aprovado.", media);
        } else if (media >= 6.0) {
            System.out.printf("O estudante teve média %.1f e está de recuperação.", media);
        } else {
            System.out.printf("O estudante teve média %.12f e foi reprovado.", media);
        }
    }
}
