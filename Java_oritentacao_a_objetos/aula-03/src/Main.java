public class Main {
    static void main() {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Conta conta = new Conta();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranhadoSofa();

        conta.depositar(1000);
        conta.consultarSaldo();

        conta.sacar(500);
        conta.consultarSaldo();
    }
}
