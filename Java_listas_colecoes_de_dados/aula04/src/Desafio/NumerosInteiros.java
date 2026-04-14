package Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumerosInteiros {
    static void main() {

        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(17);
        listaInteiros.add(67);
        listaInteiros.add(23);
        listaInteiros.add(39);
        System.out.println("Aleatorio: " + listaInteiros);

        Collections.sort(listaInteiros);
        System.out.println("Ordenados: " + listaInteiros);
    }
}
