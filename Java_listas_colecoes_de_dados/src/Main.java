import br.com.alura.screematch.model.Episodio;
import br.com.alura.screematch.model.Filme;
import br.com.alura.screematch.model.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomenda;

import java.util.ArrayList;

public class Main {
    static void main() {
        //Instanciação de classes
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Filme filme3 = new Filme();
        Serie serie1 = new Serie();
        Serie serie2 = new Serie();
        CalculadoraTempo calculadoraTempo = new CalculadoraTempo();
        FiltroRecomenda filtroRecomenda = new FiltroRecomenda();
        Episodio episodio1 = new Episodio();
        Episodio episodio2 = new Episodio();

        System.out.println("SCREENMATCH");

        //Informações do filme1
        filme1.setNome("A origem");
        filme1.setDuracao(180);
        filme1.setAnoDeLancamento(2010);
        filme1.setIncluidoNoPlano(true);
        filme1.setDiretor("Christopher Nolan");

        //Exibição informações filme1
        filme1.exibeFichaTecnica();

        //Notas do filme1
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        filtroRecomenda.filtra(filme1);
        System.out.println("Diretor: " + filme1.getDiretor());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Nota do filme IMDB: " + filme1.pegaMedia());


        //Informações do filme2
        filme2.setNome("Clube da Luta");
        filme2.setDuracao(160);
        filme2.setAnoDeLancamento(1999);
        filme2.setIncluidoNoPlano(true);
        filme2.setDiretor("David Fincher");

        //Exibição informações filme2
        filme2.exibeFichaTecnica();

        //Notas do filme2
        filme2.avalia(7.5);
        filme2.avalia(8);
        filme2.avalia(9);
        filtroRecomenda.filtra(filme2);
        System.out.println("Diretor: " + filme2.getDiretor());
        System.out.println("Total de avaliações: " + filme2.getTotalDeAvaliacoes());
        System.out.println("Nota do filme no IMDB: " + filme2.pegaMedia());

        //Informações do filme3
        filme3.setNome("O Lobo de Wall Street");
        filme3.setDuracao(190);
        filme3.setAnoDeLancamento(2013);
        filme3.setIncluidoNoPlano(true);
        filme3.setDiretor("Martin Scorcese");

        //Exibição filme3
        filme3.exibeFichaTecnica();

        //Notas do filme3
        filme3.avalia(7.5);
        filme3.avalia(9);
        filme3.avalia(6);
        filtroRecomenda.filtra(filme3);
        System.out.println("Diretor: " + filme3.getDiretor());
        System.out.println("Total de avaliações: " + filme3.getTotalDeAvaliacoes());
        System.out.println("Nota do filme no IMDB: " + filme3.pegaMedia());

        //Exemplo arrays
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("\nTamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(2).getNome());


        //Informações serie1
        serie1.setNome("Breaking Bad");
        serie1.setDuracao(50);
        serie1.setAnoDeLancamento(2008);
        serie1.setIncluidoNoPlano(true);
        serie1.setTemporadas(5);
        serie1.setEpisodiosPorTemporada(16);
        serie1.setMinutosPorEpisodio(50);

        //Exibição informações serie1
        serie1.exibeFichaTecnica();

        //Notas serie1
        serie1.avalia(10);
        serie1.avalia(9);
        serie1.avalia(8.5);
        filtroRecomenda.filtra(serie1);
        System.out.println("Episódios por termporada: " + serie1.getEpisodiosPorTemporada());
        System.out.println("Temporadas: " + serie1.getTemporadas());
        System.out.println("Duração para maratonar a série: " + serie1.getDuracao());
        System.out.println("Nota da série no IMDB: " + serie1.pegaMedia());


        //Informações serie2
        serie2.setNome("Game of Thrones");
        serie2.setDuracao(50);
        serie2.setAnoDeLancamento(2011);
        serie2.setIncluidoNoPlano(false);
        serie2.setTemporadas(8);
        serie2.setEpisodiosPorTemporada(10);
        serie2.setMinutosPorEpisodio(50);

        //Exibição informações serie2
        serie2.exibeFichaTecnica();

        //Notas da serie2
        serie2.avalia(10);
        serie2.avalia(8.5);
        serie2.avalia(5);
        filtroRecomenda.filtra(serie2);
        System.out.println("Episódios por temporada: " + serie2.getEpisodiosPorTemporada());
        System.out.println("Temporadas: " + serie2.getTemporadas());
        System.out.println("Duração para maratonar a série: " + serie2.getDuracao());
        System.out.println("Nota da série no IMDB: " + serie2.pegaMedia());



        //Calculadora para descobir o total de horas de todos os conteudos do site
        calculadoraTempo.inclui(filme1);
        calculadoraTempo.inclui(filme2);
        calculadoraTempo.inclui(serie1);
        calculadoraTempo.inclui(serie2);
        calculadoraTempo.getTempoTotal();
        System.out.println("\nTotal de horas: " + calculadoraTempo.getTempoTotal());

        //Para episodio1
        episodio1.setNumero(59);
        episodio1.setNome("Ozymandias");
        episodio1.setTotalVisualizacoes(2500000);
        episodio1.setSerie(serie1);
        filtroRecomenda.filtra(episodio1);

        //Para episodio2
        episodio2.setNumero(39);
        episodio2.setNome("Casamento Vermelho");
        episodio2.setSerie(serie2);
        episodio2.setTotalVisualizacoes(3000000);
        filtroRecomenda.filtra(episodio2);

        
    }
}
