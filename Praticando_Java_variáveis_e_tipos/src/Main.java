import java.util.Scanner;

public class Main {
    static void main() {
        Scanner leitor = new Scanner (System.in);

        //Leitura dos dados do paciente
        System.out.println("Digite seu nome");
        String nome = leitor.nextLine();
        System.out.println("Qual o seu sexo? (M/F)");
        String sexo = leitor.next();
        System.out.println("Qual sua idade?");
        int idade = leitor.nextInt();
        System.out.println("Qual sua altura em metros?");
        double altura = leitor.nextDouble();
        System.out.println("Qual seu peso em kilos?");
        double peso = leitor.nextDouble();

        //Instanciar a clase Paciente
        Paciente paciente = new Paciente();

        //Declaração dos objetos
        paciente.nome = nome;
        paciente.sexo = sexo;
        paciente.idade = idade;
        paciente.altura = altura;
        paciente.peso = peso;

        //Exibição dos dados do paciente
        System.out.println("\nNome: " + paciente.nome);
        System.out.println("Sexo: " + paciente.sexo);
        System.out.println("idade: " + paciente.idade);
        System.out.println("Altura: " + paciente.altura);
        System.out.println("Peso: " + paciente.peso);
    }
}