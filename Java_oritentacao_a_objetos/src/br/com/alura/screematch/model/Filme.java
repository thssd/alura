package br.com.alura.screematch.model;

public class Filme {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somasDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracao;


    //exemplo getters
    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public int getDuracao() {
        return duracao;
    }

    //exemplo setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    //Metodo para retornar o total de avaliações do filme
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //setter para o atributo private int duracao
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    //metodo void para exibir a ficha técnica
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme em minutos: " + duracao);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
    }

    //metodo void para coletar as notas
    public void avalia(double nota){
        somasDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //metodo para retorna a media de avaliação do filme
    public double pegaMedia(){
        return somasDasAvaliacoes / totalDeAvaliacoes;
    }
}