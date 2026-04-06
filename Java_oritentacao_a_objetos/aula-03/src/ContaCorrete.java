public class ContaCorrete extends Conta{
    private double tarifaMensal;

    public void cobraTarifa(){
        saldo -= tarifaMensal;
    }
}
