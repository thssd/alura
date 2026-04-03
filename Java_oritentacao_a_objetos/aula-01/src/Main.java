import br.com.alura.screematch.model.Filme;

public class Main {
    static void main() {
        Filme filme = new Filme();

        filme.setNome("A origem");
        filme.setDuracao(180);
        filme.setAnoDeLancamento(2010);
        filme.setIncluidoNoPlano(true);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.println("Nota do filme IMDB: " + filme.pegaMedia());
    }
}
