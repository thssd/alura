import java.util.ArrayList;
import java.util.List;

public class Terminal {
    static void main() {

        //exercicio 1
        Oficina oficina = new Oficina("Ford Bronco", "ABC-987", 2026);

        System.out.println("Veiculo cadastrado:");
        System.out.println("Modelo: " + oficina.getModelo());
        System.out.println("Placa: "+ oficina.getPlaca());
        System.out.println("Ano: " + oficina.getAno());

        //exercicio 2
        List<Contatos> listaDeContatos = new ArrayList<>();
        listaDeContatos.add(new Contatos("João Silva", "(11) 99999-0000"));
        listaDeContatos.add(new Contatos("Luana Santos", "(21) 98888-0000"));
        listaDeContatos.add(new Contatos("Pedro Oliveira", "(31) 97777-0000"));

        int i = 0;
        for (Contatos contatos: listaDeContatos){
            i++;
            System.out.printf("\n%d - %s | %s", i, contatos.getNome(), contatos.getNumero());
        }

        //exercicio 3
        GestaoEstoque estoque = new GestaoEstoque();

        estoque.setProduto("Mouse");
        estoque.setPreco(2);

        System.out.println("\n\nProduto: " + estoque.getProduto());
        System.out.println(estoque.validaPreco(estoque.getPreco()));

        //exercicio 4
        Senha senha = new Senha("12345");

        senha.setSenha("12345", "abcde");

        System.out.println(senha.getSenha());

        //exercicio 5
        Bateria bateria = new Bateria();

        bateria.setBateria(-1);

        System.out.print("\nStatus: ");
        bateria.validaBateria(bateria.getBateria());

        //exercicio 6
        ContaBancaria conta = new ContaBancaria("Roger");

        conta.deposito(1000);

        System.out.println("\nTitular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.saca(1200);
        System.out.println(conta.getSaldo());

        //exercicio 7
        Filme filme = new Filme("Matrix");
        filme.media(5);
        filme.media(6);
        filme.media(8);

        filme.exibeFichaFilme();

        //exercicio 8
        ValidarSenha s = new ValidarSenha("carlos@gmail.com");

        System.out.println("\n\nUsuário: " + s.getNome());

        s.validarSenha(3289);
        s.validarSenha(2189);
        s.validarSenha(12345);

        //exercicio 9
        Pontos pontos = new Pontos("Fernanda");

        System.out.println("\nNome: " + pontos.getNome());
        pontos.ganharPontos(50);
        pontos.exibirStatus();

        //exercicio 10

    }
}
