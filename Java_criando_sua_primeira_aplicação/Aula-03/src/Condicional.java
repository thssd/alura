public class Condicional {
    static void main() {
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        int anoDeLancamento = 2022;
        String plano = "plus";

        if (anoDeLancamento >= 2020){
            System.out.println("Lançamento em alta entre os cliente!");
        } else {
            System.out.println("Filme retrô que vale apena ver denovo!");
        }
        if (incluidoNoPlano && plano.equals("plus")) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
