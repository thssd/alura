public class Disciplina {

    private String nome;
    private double nota;
    private double somaNota;
    private double media;
    private int i;

    public void validaNota(double nota){
        if (nota >= 0 && nota <= 10){
            i++;
            somaNota += nota;
            media = somaNota / i;
        } else {
            System.out.println("Nota inválida: " + nota);
        }
    }

    public void exibeMedia(){
        System.out.println("Total de notas validas: " + i);
        System.out.printf("Média em %s: %.2f", nome, media);
    }

    public Disciplina(String nome) {
        this.nome = nome;
    }
}
