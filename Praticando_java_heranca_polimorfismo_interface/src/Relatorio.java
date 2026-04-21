public class Relatorio implements Imprimivel{
    private String titulo;
    private String mensagem;

    public Relatorio(String titulo, String mensagem) {
        this.titulo = titulo;
        this.mensagem = mensagem;
    }

    @Override
    public void imprimir() {
        System.out.println("\nTitulo: " + titulo);
        System.out.println("Conteúdo: " + mensagem);
    }
}
