public class Livraria {

    String livro;
    int diasDeAtraso;
    double multa;

    public void multa(int diasDeAtraso){
        multa = diasDeAtraso * 2.5;
    }

    public void exibeFichaLivro(){
        System.out.printf("\nLivro: %s | Multa por %d dias de atraso: %.2f", livro, diasDeAtraso, multa);
    }
}
