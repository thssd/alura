public class Sms extends Notificacao{

    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Mensagem: " + getMensagem());
    }
}
