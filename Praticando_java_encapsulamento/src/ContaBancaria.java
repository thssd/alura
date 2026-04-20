public class ContaBancaria {

    private String titular;
    private double saldo = 0;

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public double deposito(double valor){
        return saldo += valor;
    }

    public double saca(double valor){
        if (valor > saldo){
            System.out.println("Saldo insufisciente.");
            return saldo;
        }
        return saldo -= valor;
    }
}
