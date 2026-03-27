public class Main {
    static void main() {
        System.out.println("Esse é o ScreeMatch!");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.7 + 8.2) / 3f;
        System.out.println(String.format("Nota do filme: %.2f", media));
        String sinopse = """
                Sinopse: Filme de ação com Tom Cruise
                """;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

        double x = 10.5;
        float y = (float) x;
        System.out.println(y);


    }
}