import java.util.Scanner;

public class Sequencia {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        while (true){
            System.out.println("Digite um número ou 'fim' para encerrar.");
            String escolha = leitor.next();

            if (escolha.equals("fim")){
                break;
            }

            int numero = Integer.parseInt(escolha);

            if (numero > 0){
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        System.out.println("Total de números negativos: " + negativos);
        System.out.println("Total de números positivos: " + positivos);
    }
}
