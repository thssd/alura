package br.com.alura.screematch.model;

public class Titulo {

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

    //setter para o atributo private int duracao
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    //metodo void para coletar as notas
    public void avalia(double nota){
        somasDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //Metodo para retornar o total de avaliações
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //metodo para retornar a media de avaliação
    public double pegaMedia(){
        return somasDasAvaliacoes / totalDeAvaliacoes;
    }

    //metodo void para exibir a ficha técnica do filme
    public void exibeFichaTecnica(){
        System.out.println("\nTítulo: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracao);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
    }
}
