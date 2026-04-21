public class Estudante extends Pessoa{
    private double nota;

    public Estudante(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nEstudante: " + nome + " | Idade: " + idade + " | Nota: " + nota);
    }
}
