import java.util.ArrayList;

public class Principal {
    static void main() {
        Produto produto1 = new Produto("Perfume", 299.90);
        Produto produto2 = new Produto("Camiseta", 50);
        Produto produto3 = new Produto("Moletom", 190);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Carne", 75, "20/01/2027");


        produto3.setNome("Moletom");
        produto3.setPreco(190);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produto aleatorio: " + listaDeProdutos.get(2).getNome());
        System.out.println("Lista de produtos: " + listaDeProdutos);

        System.out.println(produtoPerecivel);

    }
}
