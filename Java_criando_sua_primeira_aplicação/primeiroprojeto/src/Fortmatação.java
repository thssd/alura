public class Fortmatação {
    public static void main(String[] args) {
        String nome = "Thiago";
        int aulas = 4;

        String mensagem= """
                Olá, meu nome é %s 
                está é minha %d aula de Java!
                """. formatted (nome, aulas);

        System.out.println(mensagem);
    }
}
