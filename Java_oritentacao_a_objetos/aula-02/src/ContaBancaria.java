public class ContaBancaria {

    private int numeroDaConta;
    private double saldo = 20392.89;
    public String titular;

    //Getters
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String isTitular() {
        return titular;
    }

    //Setters
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Metodo ficha tecnica
    public  void exibeFichaBancaria(){
        System.out.println("\nNúmero da conta: " + numeroDaConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Titular: " + titular);
    }
}
