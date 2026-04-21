public class BoletoBancario extends Pagamento{
    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento(){
        double taxa = ((double) 1 / 100) * getValor();
        System.out.printf("\nPagamento de R$%.2f confirmado no Boleto. (taxa: R$%.2f)", getValor(), taxa);
    }
}
