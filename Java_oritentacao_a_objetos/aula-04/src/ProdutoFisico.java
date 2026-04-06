public class ProdutoFisico implements Calculavel{
    private double precoProduto;
    private double imposto = 7.50;

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoProduto + imposto;
    }
}
