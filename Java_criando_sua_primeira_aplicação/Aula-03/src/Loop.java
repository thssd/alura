import java.util.Scanner;

public class Loop {
    public static void main (String[] args){
        Scanner leitura = new Scanner (System.in);
        double nota = 0;
        double mediaDeNota = 0;
        int totalDeNota = 0;

        while (nota != -1) {
            System.out.println("Digite sua nota para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaDeNota += nota;
                totalDeNota++;
            }
        }
        System.out.println("Média: " + mediaDeNota / totalDeNota);
    }
}
