public class Revista extends Midia{
    private int edicao;

    public void exibirDados() {
        System.out.println("Código: LIB-" + getTitulo().substring(0, 3) + " | Titulo: " + getTitulo() + " - Edição: " + edicao);
    }

    public Revista(String titulo, int anoDePublicacao, int edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }
}
