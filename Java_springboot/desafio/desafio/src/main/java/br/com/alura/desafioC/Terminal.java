package br.com.alura.desafioC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Terminal {
    public static void main(String[] args) {

        //exercicio 1
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //exercicio 2
        List<String> palavras = Arrays.asList("java", "stream", "bruno", "lambda", "alçapao");

        palavras.stream()
                .sorted()
                .forEach(System.out::println);

        //exercicio 3
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> novaLista = listaDeNumeros.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(novaLista);

        //exercicio 4
        List<String> palavras2 = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        palavras2.stream()
                .distinct()
                .forEach(System.out::println);



        //exercicio 6
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Charlie", 19),
                new Pessoa("Bob", 17),
                new Pessoa("Alice", 22),
                new Pessoa("Bruno", 16)
        );

        pessoas.stream()
                .filter(n -> n.getIdade() >= 18)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .forEach(System.out::println);

        //exercicio 7
        List<Loja> produtos = Arrays.asList(
                new Loja("Smartphone", 800.0, "Eletrônicos"),
                new Loja("Notebook", 1500.0, "Eletrônicos"),
                new Loja("Teclado", 200.0, "Eletrônicos"),
                new Loja("Cadeira", 300.0, "Móveis"),
                new Loja("Monitor", 900.0, "Eletrônicos"),
                new Loja("MousePad", 50.0, "Eletrônicos"),
                new Loja("Mesa", 700.0, "Móveis")
        );

        List<Loja> newList = produtos.stream()
                .filter(n -> n.getCategoria().equalsIgnoreCase("eletrônicos"))
                .sorted(Comparator.comparing(Loja::getPreco))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(newList);


    }
}
