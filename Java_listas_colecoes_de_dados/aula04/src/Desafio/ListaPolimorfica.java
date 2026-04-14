package Desafio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaPolimorfica {
    static void main() {
        List<String> listaPolimorfica;

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("A");
        listaPolimorfica.add("B");
        System.out.println(listaPolimorfica);

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("a");
        listaPolimorfica.add("b");
        System.out.println(listaPolimorfica);
    }
}
