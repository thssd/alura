import java.util.*;

public class Terminal {
    static void main() {

        //exercicio 1
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println(funcionarios);

        //exercicio 2
        List<String> alunos = new ArrayList<>();

        alunos.add("Joana");
        alunos.add("Lucas");
        alunos.add("Pedro");
        alunos.add("Antonio");

        System.out.println("\nLista inicial: " + alunos);

        alunos.remove(2);
        System.out.println("Lista atualizada: " + alunos);

        //exercicio 3
        List<String> empresa = new ArrayList<>();
        empresa.add("João");
        empresa.add("Maria");
        empresa.add("Ana");
        empresa.add("Pedro");
        empresa.add("Antônio");

        System.out.println("\nA segunda pessoa da lista é: " + empresa.get(1));
        System.out.println("Total de funcionários: " + empresa.size());

        //exercicio 4
        List<String> eventos = new ArrayList<>();
        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> eventosUnico = new HashSet<>(eventos);

        System.out.println("\n" + eventosUnico);

        //exercicio 5
        Map<Integer, String> clientes = new HashMap();
        clientes.put(1, "Roger");
        clientes.put(2, "Arnaldo");
        clientes.put(3, "Galvao");

        System.out.println("\nNome do cliente de id 2: " + clientes.get(2));

        //exercicio 6
        Map<Integer, String> nomes = new HashMap<>();
        nomes.put(1, "Maria");
        nomes.put(2, "Marcos");
        nomes.put(3, "Ana");
        nomes.put(4, "Joana");
        nomes.put(5, "Karen");

        int idCliente = 7;

        if (nomes.containsKey(idCliente)){
            System.out.println("\nCliente encontrado: " + nomes.get(idCliente));
        } else {
            System.out.println("\nCliente não encontrado.");
        }

        //exercicio 7
        List<String> churros = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
        List<String> picole = churros.stream()
                .filter(n -> n.length() <= 5)
                        .toList();
        System.out.println("\n" + picole);

        //exercicio 8
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> quadrado = numeros.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("\n" + quadrado);

        //exercicio 9
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double totalSemImposto = precosProdutos.stream()
                        .reduce(0.0, Double::sum);
        System.out.println("\nTotal antes do imposto: " + totalSemImposto);

        double imposto = totalSemImposto * 0.08;
        double precoTotal = totalSemImposto + imposto;

        System.out.printf("Preço total: %.2f", precoTotal);

        //exercicio 10
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double somaNota = notas.stream()
                .reduce(0.0, Double::sum);

        double media = somaNota / notas.size();

        double menor = notas.stream()
                .min(Double::compare).get();

        double maior = notas.stream()
                .max(Double::compare).get();

        System.out.println("\n\nMédia: " + media);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}
