public class Saldo {

    double valor;

    public void zeraSaldo(double saldo){
        saldo -= saldo;
        System.out.println("Saldo atual: " + saldo);
    }

    public void exibeSaldo(){
        System.out.println("\nSaldo atual: " + valor);
    }
}
