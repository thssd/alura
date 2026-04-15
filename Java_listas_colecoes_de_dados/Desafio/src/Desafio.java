import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio{
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int resposta = 1;

        System.out.println("Digite o limite do cartão:");
        double limite = leitor.nextDouble();
        leitor.nextLine();

        Map<String, Double> listaDeCompras = new HashMap<>();

        while (resposta == 1) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitor.nextLine();
            System.out.println("Digite o preço:");
            double preco = leitor.nextDouble();

            if (preco > limite) {
                System.out.println("Saldo insufisciente.");
            } else {
                listaDeCompras.put(descricao, preco);
                limite -= preco;
                System.out.println("Compra realizada!");
            }

            System.out.println("Aperte '1' para continuar comprando ou '0' para sair. ");
            resposta = leitor.nextInt();
            leitor.nextLine();


            if (resposta != 1) {
                for (String compras: listaDeCompras.keySet()) {
                    System.out.println("COMPRAS REALIZADAS:");
                    System.out.println("Produto: " + compras + " - Preço: " + listaDeCompras.get(compras));
                    System.out.println("Saldo do cartão: " + limite);
                }
            }

        }
    }
}
