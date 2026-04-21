public class Saque extends OpercaoBancaria{
    public Saque(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("\nSaque de R$%.2f realizado.", getValor());
    }
}
