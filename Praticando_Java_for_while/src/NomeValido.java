import java.util.Scanner;

public class NomeValido {
    static void main() {
        Scanner leitor = new Scanner (System.in);
        String nome;

        do {
            System.out.print("Digite seu nome: ");
            nome = leitor.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");
            }
        } while (nome.length() < 3);
        System.out.println("Nome " + nome + " cadastrado com sucesso!");
    }
}
