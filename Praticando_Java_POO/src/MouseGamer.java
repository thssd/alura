public class MouseGamer {

    String nome;
    double preco;
    int quantidade;

    public void exibeFicha(){
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: %.2f", preco);
        System.out.println("\nQuantidade: " + quantidade);
    }
}
