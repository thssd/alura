package br.com.alura.sreenmatch.principal;

import br.com.alura.screematch.model.Filme;
import br.com.alura.screematch.model.Serie;
import br.com.alura.screematch.model.Titulo;

import java.util.*;

public class Listas {
    static void main() {
        Filme filme1 = new Filme("A Origem", 2010);
        Filme filme2 = new Filme("Clube da Luta", 1999);
        Filme filme3 = new Filme("O Lobo de Wall Street", 2013);
        Serie serie1 = new Serie("Breaking Bad", 2008);

        filme1.avalia(6);
        filme2.avalia(8);
        filme3.avalia(10);

        List<Titulo> listaDeAssistidos = new LinkedList<>();
        listaDeAssistidos.add(filme1);
        listaDeAssistidos.add(filme2);
        listaDeAssistidos.add(filme3);
        listaDeAssistidos.add(serie1);
        for (Titulo item: listaDeAssistidos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sancdler");
        buscaPorArtista.add("Steve Carell");
        buscaPorArtista.add("Chris Rock");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Ordenados: " + buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println("Ordenação: " + listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + listaDeAssistidos);
    }
}
