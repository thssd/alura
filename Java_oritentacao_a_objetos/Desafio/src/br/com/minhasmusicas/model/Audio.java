package br.com.minhasmusicas.model;

public class Audio {

    private String titulo;
    private int totalDeVisualizacoes;
    private int totalDeCurtidas;

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public void setTotalDeCurtidas(int totalDeCurtidas) {
        this.totalDeCurtidas = totalDeCurtidas;
    }


    //Metodos
    public void exibirFichaTecnica(){
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Total de visualizações: " + totalDeVisualizacoes);
        System.out.println("Total de curtidas: " + totalDeCurtidas);
    }

    public String classificacao(int getTotalDeCurtidas){
        if (getTotalDeCurtidas() >= 5000){
            return "Titulo extremamente renomado.";
        } else if (getTotalDeCurtidas() > 2500){
            return "Titulo muito bem avaliado";
        } else {
            return "Escute este tiulo depois...";
        }
    }
}
