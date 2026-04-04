import br.com.alura.screematch.model.Filme;
import br.com.alura.screematch.model.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraTempo;

public class Main {
    static void main() {
        //Instanciação de classes
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Serie serie1 = new Serie();
        Serie serie2 = new Serie();
        CalculadoraTempo calculadoraTempo = new CalculadoraTempo();


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
        System.out.println("Total de avaliações: " + filme2.getTotalDeAvaliacoes());
        System.out.println("Nota do filme no IMDB: " + filme2.pegaMedia());


        //Informações serie1
        serie1.setNome("Lost");
        serie1.setDuracao(40);
        serie1.setAnoDeLancamento(2000);
        serie1.setIncluidoNoPlano(true);

        //Exibição informações serie1
        serie1.exibeFichaTecnica();

        //Informações de duração serie1
        serie1.setTemporadas(10);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodio(50);

        //Exibição da duração serie1
        System.out.println("Temporadas: " + serie1.getTemporadas());
        System.out.println("Duração para maratonar a série: " + serie1.getDuracao());


        //Informações serie2
        serie2.setNome("Game of Thrones");
        serie2.setDuracao(50);
        serie2.setAnoDeLancamento(2011);
        serie2.setIncluidoNoPlano(false);

        //Exibição informações serie2
        serie2.exibeFichaTecnica();

        //Informações de duração serie2
        serie2.setTemporadas(8);
        serie2.setEpisodiosPorTemporada(10);
        serie2.setMinutosPorEpisodio(50);

        //Exibição duração serie2
        System.out.println("Temporadas: " + serie2.getTemporadas());
        System.out.println("Duração para maratonar a série: " + serie2.getDuracao());



        //Calculadora para descobir o total de horas de todos os conteudos do site
        calculadoraTempo.inclui(filme1);
        calculadoraTempo.inclui(filme2);
        calculadoraTempo.inclui(serie1);
        calculadoraTempo.inclui(serie2);
        calculadoraTempo.getTempoTotal();
        System.out.println("\nTotal de horas: " + calculadoraTempo.getTempoTotal());
    }
}
