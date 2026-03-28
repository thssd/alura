import java.util.Scanner;

public class Emprestimo {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor para empréstimo");
        double valor = leitor.nextDouble();

        if (valor >= 1000 && valor <= 5000){
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.printf("O valor de R$%.2f não está dentro do intervalo permitido.", valor);
        }
        leitor.close();
    }
}
