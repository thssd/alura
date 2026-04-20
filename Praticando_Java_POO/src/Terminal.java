public class Terminal {
    static void main() {

        //exercicio 1
        MouseGamer mouseGamer = new MouseGamer();

        mouseGamer.nome = "Mouse Gamer";
        mouseGamer.preco = 159.90;
        mouseGamer.quantidade = 25;

        mouseGamer.exibeFicha();

        //exercicio 2
        Livro livro = new Livro();

        livro.titulo = "Harry Potter";
        livro.autor = "J.K Rowling";
        livro.paginas = 500;

        livro.exibeFicha();

        //exercicio 3
        Saldo saldo = new Saldo();

        saldo.valor = 1590.94;

        saldo.exibeSaldo();
        saldo.zeraSaldo(saldo.valor);
        saldo.exibeSaldo();

        //exercicio 4
        SensorTemperatura sensorTemperatura = new SensorTemperatura();

        sensorTemperatura.local = "Setor A";
        sensorTemperatura.temperatura = 39.0;
        sensorTemperatura.exibeTemperatura();
        sensorTemperatura.sesor(sensorTemperatura.temperatura);

        //exercicio 5
        Media media = new Media();

        media.nome = "João Silva";
        media.nota1 = 6.5;
        media.nota2 = 4;

        media.exibeFichaAluno();
        media.aprova();

        //exercicio 6
        Cargo cargo = new Cargo();

        cargo.nome = "Adalto";
        cargo.cargo = "Junior";
        cargo.nivelDeAcesso = 1;
        cargo.novoNivel = 2;

        cargo.exibeFichaFuncionario();
        cargo.promove();

        //exercicio 7
        Tarefas tarefas1 = new Tarefas();
        tarefas1.descricao = "Estudar Java";
        tarefas1.concluida = false;
        tarefas1.listaDeTarefas.add(tarefas1);
        System.out.println(tarefas1.exibeTarefas());

        Tarefas tarefas2 = new Tarefas();
        tarefas2.descricao = "Colocar lixo para fora";
        tarefas2.concluida = true;
        tarefas2.listaDeTarefas.add(tarefas2);
        System.out.println(tarefas2.exibeTarefas());

        //exercicio 8
        Estoque estoque = new Estoque();
        estoque.produto = "Camisa";
        estoque.quantidade = 10;

        estoque.exibeEstoque();
        estoque.vendendo(8);
        estoque.vendendo(3);

        //exercicio 9
        Livraria livraria = new Livraria();

        livraria.livro = "Dom Casmurro";
        livraria.diasDeAtraso = 3;

        livraria.multa(livraria.diasDeAtraso);
        livraria.exibeFichaLivro();

        //exercicio 10
        Checkout c1 = new Checkout();

        c1.nome = "Teclado";
        c1.preco = 120.00;
        c1.quantidade = 1;
        c1.precoTotal(c1.preco, c1.quantidade);
        c1.listaDeCompras.add(c1);

        Checkout c2 = new Checkout();
        c2.nome = "Mouse";
        c2.preco = 60;
        c2.quantidade = 2;
        c2.precoTotal(c2.preco, c2.quantidade);
        c2.listaDeCompras.add(c2);

        c1.exibeFichaTecnica();
        c2.exibeFichaTecnica();
    }
}
