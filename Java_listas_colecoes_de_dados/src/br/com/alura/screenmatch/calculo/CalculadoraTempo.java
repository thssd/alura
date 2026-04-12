package br.com.alura.screenmatch.calculo;

import br.com.alura.screematch.model.Titulo;

public class CalculadoraTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public  void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracao();
    }
}
