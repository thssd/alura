package br.com.alura.desafioD;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminal {
    public static void main(String[] args) {

        //exercicio 1
        List<Integer> numeros = Arrays.asList(100, 20, 30, 40, 50);

        int maior = numeros.stream().max(Integer::compareTo).get();
        System.out.println(maior);

        //exercicio 2
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        Map<Integer, List<String>> palavras2 = palavras.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(palavras2);

        //exercicio 3
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        String churros = String.join(", ", nomes);
        System.out.println(churros);

        //exercicio 4
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> quadrado = number.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        int somaPar = quadrado.stream().reduce(0, Integer::sum);

        System.out.println(somaPar);

        //exercicio 5
        List<Integer> machado = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> impar = machado.stream()
                .filter(n -> n % 2 == 1)
                .toList();

        List<Integer> pares = machado.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(impar);
        System.out.println(pares);

        //parte 2
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis"));

        List<Produto> listaMaster = produtos.stream()
                .filter(n -> n.getCategoria().equalsIgnoreCase("eletrônicos")
                        && n.getPreco() < 1000)
                .sorted(Comparator.comparing(Produto::getPreco))
                .toList();
        System.out.println(listaMaster);

        //exercicio 6
        Map<String, List<Produto>> listaCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        System.out.println(listaCategoria);

        //exercicio 7
        Map<String, Long> qtdCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
        System.out.println(qtdCategoria);

        //exercicio 8
        Map<String, Optional<Produto>> maisCaro = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparing(Produto::getPreco))));
        System.out.println(maisCaro);

        //exercicio 9
        Map<String, Double> precoTotal = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)));
        System.out.println(precoTotal);
    }
}
