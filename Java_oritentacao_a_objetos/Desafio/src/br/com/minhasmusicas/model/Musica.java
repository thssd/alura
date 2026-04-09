package br.com.minhasmusicas.model;

public class Musica extends Audio {
    private String artista;
    private String feat;
    private int duracaoEmSegundos;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFeat() {
        return feat;
    }

    public void setFeat(String feat) {
        this.feat = feat;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    @Override
    public int getTotalDeVisualizacoes() {
        if (this.getTotalDeVisualizacoes() > 5000000){
            return 6;
        } else if (this.getTotalDeVisualizacoes() > 10000000){
            return 8;
        } else if (this.getTotalDeVisualizacoes() > 20000000){
            return 10;
        } else {
            return 5;
        }
    }
}
