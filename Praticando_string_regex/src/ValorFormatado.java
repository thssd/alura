import java.util.Scanner;

public class ValorFormatado {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = leitor.nextDouble();

        System.out.printf("Valor formatado R$%.2f", valor);
    }
}
