public class Desafio {
    public static void main(String[] args){

    // EXERCICÍO 1: Crie um programa que realize a média de duas notas decimais e exiba o resultado.
    double primeiraNota = 7.5;
    double segundaNota = 9.25;
    double media = (primeiraNota + segundaNota) / 2;
        System.out.println("A media das notas foi: " + media);

    //  EXERCICÍO 2: Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
    double valorUm = 23.5;
    int x = (int) valorUm;
        System.out.println(x);

    // EXERCICÍO 3: Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
    char letra = 'A';
    String palavra = " Abacaxi";
    String mensagem = "A primeira letra de" + palavra + " é " + letra;
        System.out.println(mensagem);

    // EXERCICÍO 4: Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
    double precoProduto = 69.99;
    int quantidade = 6;
    double valorTotal = precoProduto * quantidade;
        System.out.println(String.format("O valor total a ser pagado é: %.2f", valorTotal));

    // EXERCICÍO 5: Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
    double valorEmDolares = 500;
    double conversor = valorEmDolares * 4.94;
        System.out.println(String.format("O valor em reais é igual a: %.2f", conversor));

    // EXERCICÍO 6: Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
    double precoOriginal = 4000;
    double percentualDeDesconto = precoOriginal * 0.25;
    double precoFinal = precoOriginal - percentualDeDesconto;
        System.out.println("O preço original é: " + precoOriginal);
        System.out.println("O preçoo do desconte foi de: " + percentualDeDesconto);
        System.out.println("O preço final foi de: " + precoFinal);
    }
}
