import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = leitura.next();
        System.out.print("Qual sua idade? ");
        int idade = leitura.nextInt();
        leitura.nextLine();
        System.out.print("Qual sua cidade? ");
        String cidade = leitura.nextLine();
        leitura.close();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }
}
