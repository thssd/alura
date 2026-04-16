import java.util.ArrayList;

public class Terminal {
    static void main() {
        Jogadores jogador1 = new Jogadores("Messi", 38);
        Jogadores jogador2 = new Jogadores("Ronaldo", 41);
        Jogadores jogador3 = new Jogadores("Neymar", 34);
        Piloto piloto1 = new Piloto("Hamilton", 41);
        Produto produto1 = new Produto("Camisa", 99);
        Produto produto2 = new Produto("Garrafa", 30);
        Produto produto3 = new Produto("Perfume", 299);
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        ContaBancaria contaBancaria1 = new ContaBancaria(8392);
        ContaBancaria contaBancaria2 = new ContaBancaria(198923);
        ContaBancaria contaBancaria3 = new ContaBancaria(5327.89);

        //Exercicio 1, 2 e 3
        ArrayList<Atleta> listaAtletas = new ArrayList<>();
        listaAtletas.add(jogador1);
        listaAtletas.add(jogador2);
        listaAtletas.add(jogador3);
        listaAtletas.add(piloto1);

        //listaAtletas.forEach(nome -> System.out.println(nome));

        for (Atleta nomes: listaAtletas){
                Atleta atleta = nomes;
                System.out.println(atleta.getNome() + " " + atleta.getIdade());
        }

        //Exercicio 4
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double total = 0;
        for (Produto p: listaProdutos){
            total += p.getPreco();
            System.out.println(total);
        }
        double media = total / listaProdutos.size();
        System.out.printf("Média do preço dos produtos: R$%.2f", media);

        //Exercicio 5
        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);
        circulo.setRaio(4);
        quadrado.setLado(16);

        for (Forma f: listaDeFormas){
            System.out.println("\nÁrea do circulo: " + circulo.calcularArea());
            System.out.println("Área do quadrado: " + quadrado.calcularArea());
        }

        //Exercicio 6
        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(contaBancaria1);
        listaDeContas.add(contaBancaria2);
        listaDeContas.add(contaBancaria3);
        double maior = 0;
        for (ContaBancaria cb: listaDeContas){
            if (cb.getSaldo() > maior){
                maior = cb.getSaldo();
            }
            System.out.println(cb.getSaldo());
        }
        System.out.println("Maior saldo: " + maior);

    }
}
