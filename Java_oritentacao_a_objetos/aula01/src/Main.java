public class Main {
    static void main() {
        Filme filme = new Filme();

        filme.nome = "A origem";
        filme.duracao = 180;
        filme.anoDeLanacamento = 2010;

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println(filme.somasDasAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.println(filme.pegaMedia());
    }
}
