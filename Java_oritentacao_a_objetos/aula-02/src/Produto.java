public class Produto {

    public String nome = "Dior Sauvage";
    private double preco = 299.99;

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Metodo desconto
    public void aplicaDesconto(){
        double desconto = preco * 0.10;
        this.preco = preco - desconto;
        System.out.println(preco);
    }

    //Exibe as informações
    public  void ExibeFichaProduto(){
        System.out.println("\nProduto: " + nome);
        System.out.println("Preço sem desconto: " + preco);
    }
}
