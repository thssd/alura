import java.util.Scanner;

public class Desconto {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de sua compra.");
        double valorCompra = leitor.nextDouble();

        double desconto = valorCompra * 0.10;
        double valorComDesconto = valorCompra - desconto;

        if (valorCompra >= 100){
            System.out.println("O valor de 10% de desconto foi aplicado.");
            System.out.printf("Valor final da compra: R$%.2f\n", valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor final da compra: R$%.2f\n" + valorCompra);
        }
    }
}
