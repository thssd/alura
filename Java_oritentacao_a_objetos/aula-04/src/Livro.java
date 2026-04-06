public class Livro implements Calculavel{
    private double precoLivro;
    private double frete = 5.00;

    public double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoLivro + frete;
    }
}
