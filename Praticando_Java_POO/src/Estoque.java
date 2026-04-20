public class Estoque {

    String produto;
    int quantidade;

    public void exibeEstoque(){
        System.out.println("\nProduto: " + produto);
        System.out.println("Quantidade: " + quantidade);
    }

    public void vendendo(int venda){
        if (venda <= quantidade){
            quantidade -= venda;
            System.out.println("Venda realizada. Estoque atual: " + quantidade);
        } else {
            System.out.println("Saldo insufisciente.");
        }
    }
}
