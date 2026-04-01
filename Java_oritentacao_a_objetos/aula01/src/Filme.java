public class Filme {

    String nome;
    int anoDeLanacamento;
    boolean incluidoNoPlano;
    double somasDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracao;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLanacamento);
    }

    void avalia(double nota){
        somasDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somasDasAvaliacoes / totalDeAvaliacoes;
    }
}