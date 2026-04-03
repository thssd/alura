public class Jogador {

    String nome;
    int idade;
    int gols;
    int assistencias;
    double mediaAvaliacao;

    void exibaFichaJogador(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Número de gols: " + gols);
        System.out.println("Número de assistências: " + assistencias);
    }

    double avalia(){
        double nota1 = 7;
        double nota2 = 10;
        double nota3 = 9.5;
        return (nota1 + nota2 + nota3) / 3;
    }
}
