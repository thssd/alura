public class Aluno {
    private String nome;
    private String tipo;

    public void identificar(){
        System.out.printf("\nAluno: %s | Tipo: %s", nome, tipo);
    }

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
