import java.util.Scanner;

public class Desafio {
    static void main() {

        //Declaração das variaveis
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 4528.67;
        int opcao = 0;
        double transferir = 0;

        //Informações do cliente
        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + nome);//O "\n" serve para pular uma linha
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo do cliente: " + saldo);
        System.out.println("\n*************************");

        //Menu de operações usando textblocks
        String operacao = """
                    \nOperações:
                    
                    [1] para consultar saldos
                    [2] para receber valor
                    [3] para transferir valor
                    [4] sair
                    """;
        //Scanner para saber qual a opção que o usuário escolheu
        Scanner leitor = new Scanner (System.in);

        //Loop que irá repitir até que a resposta seja igual a 4, se for diferente ele continua
        while (opcao != 4) {
            System.out.println(operacao);
            opcao = leitor.nextInt();

            //Escolha de casos
            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Quanto você irá receber?");
                    double receber = leitor.nextDouble();
                    saldo += receber;//O valor recebido será acrescentado ao saldo
                    break;
                case 3:
                    System.out.println("Qual valor você irá transferir?");
                    transferir = leitor.nextDouble();
                    saldo -= transferir;//O valor tranferido sera subtraído do saldo
                    //Se o valor que o usuário deseja transferir for maior que o saldo então operação inválida
                    if (transferir > saldo){
                        System.out.println("Saldo insuficiente para a realização da transferência.");
                    }
                    break;
            }
            //Se a opção for maior que 4 então operação inválida
            if (opcao > 4) {
                System.out.println("Operação inválida.");
            }
        }
    }
}