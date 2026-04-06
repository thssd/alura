public class Produto implements Vendaval{
    private double preco;
    private int quantidade;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double precoFinal() {
        if (quantidade >= 3){
            return preco - 4.50;
        } else if (quantidade >= 1){
            return preco + 5.00;
        } else {
            return preco;
        }
    }
}
