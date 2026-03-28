import java.util.Scanner;

public class Doador {
    static void main() {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite sua idade.");
        int idade = leitor.nextInt();
        System.out.println("Digite seu peso em kg.");
        double peso = leitor.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso >= 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compátivel para doar sangue.");
        } else {
            System.out.println("O doador não é compátivel.");
            if (!idadeValida) {
                System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("Motivo: Deve ter pelo menos 50kg.");
            }
        }
    }
}
