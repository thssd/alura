import java.util.Scanner;

public class Senha {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a senha");
        String senha = leitor.next();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%¨&*])[A-Za-z\\d!@#$%¨&*]{8,}$";

        if (senha.matches(regex)){
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");

        }
    }
}
