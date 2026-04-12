import java.util.ArrayList;

public class Terminal {
    static void main() {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("João");
        pessoa1.setIdade(20);
        pessoa2.setNome("Epaminondas");
        pessoa2.setIdade(79);
        pessoa3.setNome("Gael");
        pessoa3.setIdade(3);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome() + ", idade: " + listaDePessoas.get(0).getIdade());
        System.out.println("Lista completa: " + listaDePessoas);
    }
}
