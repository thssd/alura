public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String conteudo, String mensagem) {
        super(destinatario, mensagem);
        this.titulo = conteudo;
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Titulo: " + titulo);
        System.out.println("Conteúdo: " + getMensagem());
    }
}
