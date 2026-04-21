public class Ebook extends Midia{
    private String formato;

    public void exibirDados() {
        System.out.println("Código: LIB-" + getTitulo().substring(0, 3) + " | Titulo: " + getTitulo() + " - Formato: " + formato);
    }

    public Ebook(String titulo, int anoDePublicacao, String formato) {
        super(titulo, anoDePublicacao);
        this.formato = formato;
    }
}
