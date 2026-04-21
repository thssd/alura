public abstract class OpercaoBancaria implements AcaoBancaria{
    private double valor;

    public OpercaoBancaria(double valor) {
        this.valor = valor;
    }

    @Override
    public void executar() {
    }

    public double getValor() {
        return valor;
    }
}
