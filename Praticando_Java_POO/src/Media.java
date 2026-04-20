public class Media {

    String nome;
    double nota1;
    double nota2;
    double media;

    public void aprova(){
        media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        if (media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }
    }

    public void exibeFichaAluno(){
        System.out.println("\nNome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }
}
