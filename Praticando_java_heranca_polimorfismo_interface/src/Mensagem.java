public class Mensagem {

    public void enviarMensagem (String mensagem){
        System.out.println("\n\nMensagem para todos: " + mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem){
        System.out.println("Mensagem para " + destinatario + ": " + mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem, int quantidade){
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Mensagem para " + destinatario + ": " + mensagem);
        }
    }
}
