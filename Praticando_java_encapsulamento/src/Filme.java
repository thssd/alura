public class Filme {

    private String filme;
    private double nota = 0;
    int i = 0;
    double mediaFilme;

    public Filme(String filme) {
        this.filme = filme;
    }

    public double media(double avaliacao){
        i++;
        nota += avaliacao;
        mediaFilme = nota / i;
        return mediaFilme;
    }

    public void exibeFichaFilme(){
        System.out.printf("\nMédia de avaliações do filme %s: %.2f.", filme, mediaFilme);
    }
}
