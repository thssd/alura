public class ModeloCarro extends Carro{
    static void main() {
        Carro carro = new Carro();

        carro.defineModelo("T-Cross");
        carro.definePreco(80000, 95000, 100000);
        carro.exibirFichaCarro();
    }
}
