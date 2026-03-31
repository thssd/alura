import java.util.Scanner;

public class Senha {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        final String senha = "1234";

        for (int i = 2; i >= 0; i--) {
            System.out.print("Digite a senha: ");
            String tentativa = leitor.next();

            if (tentativa.equals(senha)) {
                System.out.println("Senha correta! Acesso concedido.");
                break;
            } else if (i >= 1){
                System.out.println("Senha incorreta. Você tem " + i + " tentativas restantes.\n");
            } else {
                System.out.println("Conta bloqueada temporariamente.");;
            }
        }
    }
}
