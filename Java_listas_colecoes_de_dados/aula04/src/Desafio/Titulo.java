package Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = getNome();
    }

    public String getNome() {
        return nome;
    }
    static void main() {
        List<Titulo> lista = new LinkedList<>();
        lista.add(new Titulo("Messi"));
        lista.add(new Titulo("Rogerio"));
        lista.add(new Titulo("Adalto"));
        lista.add(new Titulo("Bruno"));
        lista.add(new Titulo("Zidane"));

        Collections.sort(lista);
        System.out.println(lista);

    }
    @Override
    public int compareTo(Titulo outroNome) {
        return this.getNome().compareTo(outroNome.getNome());
    }
}
