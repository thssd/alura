public class Conta {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de " + valor + " realizado.");
    }

    public void sacar(double valor){
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado.");
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é  de: " + saldo);
    }
}
