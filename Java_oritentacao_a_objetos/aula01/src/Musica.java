//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {

    String titulo;
    String banda;
    int anoLancamento;
    double numAvaliacao;
    int totalAvaliacao;

    void exibaFichaMusica(){
        System.out.println("Título: " + titulo);
        System.out.println("Banda: " + banda);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        numAvaliacao += nota;
        totalAvaliacao++;
    }
    double mediaMusica(){
     return numAvaliacao / totalAvaliacao;
    }
}
