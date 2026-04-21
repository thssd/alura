public class Deposito extends OpercaoBancaria{
    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("\nDepósito de R$%.2f realizado.", getValor());
    }
}
