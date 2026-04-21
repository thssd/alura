public class Terminal {
    static void main() {

        //exercicio 1
        Aluno aluno1 = new Aluno("Fernanda", "Regular");
        Bolsista aluno2 = new Bolsista("Lucas");

        aluno1.identificar();
        aluno2.identificar();

        //exercicio 2
        Pessoa estudante1 = new Estudante("Enzo", 14, 6.5);
        Pessoa estudante2 = new Estudante("Gael", 13, 5.5);

        Pessoa docente1 = new Docente("Roger", 49, "Matemática");
        Pessoa docente2 = new Docente("Amanda", 35, "Português");

        estudante1.exibirDados();
        estudante2.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();

        //exercicio 3
        Livro livro = new Livro("O Hobbit", 1937, "J.R Tolkien");
        Revista revista = new Revista("National Geographic", 2015, 245);
        Ebook ebook = new Ebook("Clean Code", 2022, "PDF");

        livro.exibirDados();
        revista.exibirDados();
        ebook.exibirDados();

        //exercicio 4
        Notificacao email = new Email("cliente@exemplo.com", "Promoção especial!", "Aproveite nossos descontos esta semana.");
        Notificacao sms = new Sms("(11) 98765-4321", "Sua fatura foi paga com sucesso.");
        Notificacao push = new Push("usuario_app", "Novidade!", "Você tem uma nova mensagem não lida.");

        email.enviar();
        sms.enviar();
        push.enviar();

        //exercicio 5
        Pagamento cartao = new CartaoDeCredito(700.00);
        Pagamento boleto = new BoletoBancario(200.00);
        Pagamento pix = new Pix(300.00);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

        //exercicio 6
        Mensagem mensagem = new Mensagem();

        mensagem.enviarMensagem("Olá!");
        mensagem.enviarMensagem("João", "Bom dia!");
        mensagem.enviarMensagem("Maria", "Atenção!", 2);

        //exercicio 7
        Reserva reserva = new Reserva();

        reserva.reservar();
        reserva.reservar("29/01");
        reserva.reservar("10/04", 8);

        ReservaVip reservaVip = new ReservaVip();
        reservaVip.reservar();

        //exercicio 8
        Relatorio rel = new Relatorio("Relatório 2025", "Tudo funcionando conforme esperado.");

        rel.imprimir();

        //exercicio 9
        OpercaoBancaria deposito = new Deposito(250.00);
        OpercaoBancaria saque = new Saque(150);

        deposito.executar();
        saque.executar();

        //exercicio 10
        Luz luz = new Luz();
        ArCondicionado arCondicionado = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        arCondicionado.desligar();
    }
}
