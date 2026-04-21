public class CartaoDeCredito extends Pagamento{
    public CartaoDeCredito(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento(){
        double taxa = ((double) 3 / 100) * getValor();
        System.out.printf("\nPagamento de R$%.2f confirmado no Cartão de Crédito. (taxa: R$ %.2f)", getValor(), taxa);
    }
}
