public class GestaoEstoque {

    private String produto;
    private double preco;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double validaPreco(double preco){
        if (preco < 0){
            preco = 0.00;
            System.out.println("Preço inválido.");
        }
            return preco;
    }
}
