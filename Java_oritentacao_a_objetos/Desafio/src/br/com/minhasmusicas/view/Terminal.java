package br.com.minhasmusicas.view;

import br.com.spotify.model.Musica;
import br.com.spotify.model.Podcast;

public class Terminal {
    static void main() {
        //Instanciação
        Musica musica1 = new Musica();
        Podcast podcast1 = new Podcast();

        //Informações musica1
        musica1.setTitulo("Hotel California");
        musica1.setTotalDeVisualizacoes(21678140);
        musica1.setTotalDeCurtidas(382938);
        musica1.exibirFichaTecnica();
        musica1.setArtista("Eagles");
        musica1.setDuracaoEmSegundos(260);
        System.out.println("Banda: " + musica1.getArtista());
        System.out.println("Duração em segundos: " + musica1.getDuracaoEmSegundos());
        System.out.println(musica1.classificacao(382938));

        //Informações podcast1
        podcast1.setTitulo("The Joe Rogan Experience");
        podcast1.setTotalDeVisualizacoes(2290329);
        podcast1.setTotalDeCurtidas(4389);
        podcast1.exibirFichaTecnica();
        podcast1.setApresentador("Joe Rogan");
        podcast1.setEntrevistado("Elon Musk");
        podcast1.setDuracaoEmMinutos(130);
        System.out.println("Apresentador: " + podcast1.getApresentador());
        System.out.println("Entrevistado: " + podcast1.getEntrevistado());
        System.out.println("Duração em minutos: " +podcast1.getDuracaoEmMinutos());
        System.out.println(podcast1.classificacao(4389));
    }
}
