public class Notificacao {
    private String destinatario;
    private String mensagem;

    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public void enviar(){
        System.out.println("\nEnviando para: " + destinatario);
    }

    public String getMensagem() {
        return mensagem;
    }
}
