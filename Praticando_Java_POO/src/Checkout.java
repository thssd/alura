import java.util.ArrayList;
import java.util.List;

public class Checkout {

    String nome;
    double preco;
    int quantidade;
    double precoFinal;

    List listaDeCompras = new ArrayList<>();

    public void precoTotal(double preco, int quantidade){
        precoFinal = preco *= quantidade;
    }

    void exibeFichaTecnica(){
        System.out.println("\nTotal da compra: " + precoFinal);
    }
}
