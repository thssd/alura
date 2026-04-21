public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String assunto, String mensagem) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + getMensagem());
    }
}
