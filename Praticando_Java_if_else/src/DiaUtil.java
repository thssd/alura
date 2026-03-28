import java.util.Scanner;

public class DiaUtil {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um dia da semana.");
        String dia = leitor.next();

        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")){
            System.out.println(dia + " é um dia útil.");
        } else {
            System.out.println(dia + " é um final de semana.");
        }
    }
}
