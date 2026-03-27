import java.util.Scanner;

public class Senha {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int senha = 12345;

        System.out.println("Digite a senha");
        int resposta = leitor.nextInt();

        if (resposta == senha) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
