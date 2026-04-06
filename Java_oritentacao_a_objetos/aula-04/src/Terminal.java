public class Terminal {
    static void main() {
        //Instanciação Classes
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();
        Produto produto = new Produto();
        Servico servico = new Servico();

        //Exercicio 1
        conversorMoeda.setValorDolar(70);
        System.out.println("\nConversão para reais: " + conversorMoeda.converterDolarParaReal());

        //Exercicio 2
        calculadoraSalaRetangular.setAltura1(4);
        calculadoraSalaRetangular.setBase1(8);
        System.out.println("\nÁrea do retangulo: " + calculadoraSalaRetangular.calcularArea());

        calculadoraSalaRetangular.setAltura2(7);
        calculadoraSalaRetangular.setBase2(12);
        System.out.println("Área do perímetro: " + calculadoraSalaRetangular.calcularPerimetro());

        //Exercicio 3
        tabuadaMultiplicacao.setNumero(6);
        System.out.println(tabuadaMultiplicacao.mostrarTabuada());

        //Exercicio 4
        conversorTemperaturaPadrao.setCelsius(30);
        conversorTemperaturaPadrao.setFarenheit(65);
        System.out.println("\nCelsius para fahrenheit: " + conversorTemperaturaPadrao.celsiusParaFahrenheit());
        System.out.println("Fahrenheit para celsius: " + conversorTemperaturaPadrao.fahrenheitParacelsius());

        //Exercicio 5
        livro.setPrecoLivro(49.99);
        produtoFisico.setPrecoProduto(120.90);
        System.out.println("\nPreço final do livro: " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto físico: " + produtoFisico.calcularPrecoFinal());

        //Exercicio 6
        produto.setPreco(29.99);
        produto.setQuantidade(5);
        System.out.println("\nPreço final do produto: " + produto.precoFinal());
        servico.setLimpeza(300);
        servico.setDuracaoEmHoras(3);
        System.out.println("Preço final da limpeza: " + servico.precoFinal());
    }
}
