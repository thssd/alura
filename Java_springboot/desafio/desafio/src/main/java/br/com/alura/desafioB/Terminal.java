package br.com.alura.desafioB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Terminal {
    public static void main(String[] args) {
        ExemploLambda executar = (a, b) -> a * b;

        System.out.println(executar.multiplicacao(5, 7));

        //exercicio 2
        LetraMaiuscula maiuscula = s -> s.toUpperCase();

        System.out.println(maiuscula.conversor("\njava"));

        //exercicio 3
        Palindromo palindromo = p -> p.equals(new StringBuilder(p).reverse().toString());

        System.out.println(palindromo.verificarPalindromo("\narara"));
        System.out.println(palindromo.verificarPalindromo("java"));

        //exercicio 4
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);

        listaDeNumeros.replaceAll(n -> n * 3);
        System.out.println(listaDeNumeros);

        //exercicio 5
        List<String> listaDeNomes = Arrays.asList("Roger", "Adalto", "Julio", "Bruno");

        listaDeNomes.sort((a, b) -> a.compareTo(b));
        System.out.println(listaDeNomes);
    }
}
