package br.com.alura.screenmatch.calculo;

public class FiltroRecomenda {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Título extremamente renomado!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Título muito bem avaliado!");
        } else {
            System.out.println("Adicione na lista de assistir mais tarde.");
        }
    }
}
