public class Aluno {

    public String nomeAluno;
    private double nota1;
    private double nota2;
    private double nota3;

    //Getters
    public String getNomeAluno() {
        return nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    //Setters
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    //Metodo para calcular a media
    public double somaMedias(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public void exibeFichaAluno(){
        System.out.println("\nNome: " + nomeAluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + somaMedias());
    }
}
