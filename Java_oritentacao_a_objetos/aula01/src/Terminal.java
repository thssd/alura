//O resultado de todos os métodos serão exibidos no terminal.

public class Terminal {
    static void main() {
        //Instanciação de todas as classes.
        Jogador jogador1 = new Jogador();
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora1 = new Calculadora();
        Musica musica1 = new Musica();
        Carro carro1 = new Carro();
        Alunos aluno1 = new Alunos();

        //Exibição ficha técnica da classe Jogador.
        jogador1.nome = "Lionel Messi";
        jogador1.idade = 38;
        jogador1.gols = 900;
        jogador1.assistencias = 300;
        jogador1.exibaFichaJogador();
        jogador1.avalia();
        System.out.println("Nota média SofaScore: " + jogador1.avalia());

        //Resultado Pessoa
        pessoa1.exibe();

        //Resultado Calculadora
        System.out.println(calculadora1.pegaNumero(20));

        //Exibição ficha técnica da classe Musica.
        musica1.titulo = "Hotel California";
        musica1.banda = "Eagles";
        musica1.anoLancamento = 1976;
        musica1.exibaFichaMusica();
        //Avaliar a música e calcular a média das avaliações.
        musica1.avalia(8);
        musica1.avalia(5);
        musica1.avalia(10);
        System.out.println(musica1.mediaMusica());

        //Exibir ficha técnica da Classe Carro.
        carro1.exibeFichaCarro();
        System.out.println(carro1.idadeCarro());

        //Exibir ficha técnica da Classe Alunos.
        aluno1.exibeFichaAluno();
    }
}
