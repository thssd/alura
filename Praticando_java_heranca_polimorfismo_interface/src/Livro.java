public class Livro extends Midia{
    private String autor;

    public void exibirDados() {
        System.out.println("\nCódigo: LIB-" + getTitulo().substring(0, 3) + getAnoDePublicacao() + " | Titulo: " + getTitulo() + " - Autor: " + autor);
    }

    public Livro(String titulo, int anoDePublicacao, String autor) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
    }
}
