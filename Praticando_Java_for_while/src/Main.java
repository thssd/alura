import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] vendedores = {"Carlos", "Mariana", "João", "fernanda"};
        double[] vendas = {4000.00, 8000.00, 12000.00, 5000.00};

        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i].equals("Mariana")){
                continue;
            }
            System.out.printf("%s - Comissão: %.2f\n", vendedores[i], calcularComissao(vendas[i]));
        }
        int c = 0;
        boolean imprime = true;

        while (imprime){
            System.out.printf("%s - comissão: %.2f\n", vendedores[c], calcularComissao(vendas[c]));
            c++;
            System.out.print("Quer continuar? (true/false) ");
            imprime = leitor.nextBoolean();
        }

        boolean imprimeOutro = true;

        do {
            System.out.printf("%s - comissão %.2f\n", vendedores[c], calcularComissao(vendas[c]));
            c++;
            System.out.printf("quer continuar? (true/false) ");
            imprimeOutro = leitor.nextBoolean();
        } while (imprimeOutro);

        System.out.println("Todos os nomes");

        for (String nomeVendedores: vendedores){
            System.out.println("Nome: " + nomeVendedores);
        }

    }
    public static double calcularComissao (double totalvendas){
        if (totalvendas <= 5000){
            return totalvendas * 0.03;
        } else if (totalvendas <= 10000){
            return totalvendas * 0.05;
        } else {
            return totalvendas * 0.07;
        }
    }
}
