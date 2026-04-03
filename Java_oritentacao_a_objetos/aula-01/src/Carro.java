public class Carro {

    String modelo = "Ford Mustang";
    int ano = 1969;
    String cor = "Preto";
    int anoAtual = 2026;

    void exibeFichaCarro(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
    int idadeCarro(){
        return anoAtual - ano;
    }
}
