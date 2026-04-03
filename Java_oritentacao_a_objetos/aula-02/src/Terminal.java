public class Terminal {
    static void main() {
        //Instanciação de Classes
        ContaBancaria contaBancaria = new ContaBancaria();
        IdadePessoa idadePessoa = new IdadePessoa();
        Produto produto = new Produto();
        Aluno aluno = new Aluno();
        Livro livro = new Livro();

        //ContaBancaria
        contaBancaria.titular = "João";
        contaBancaria.setNumeroDaConta(32989);
        contaBancaria.exibeFichaBancaria();

        //IdadePessoa
        idadePessoa.nome = "Roberto";
        idadePessoa.setIdade(20);
        idadePessoa.exibeIdadePessoa();

        //Produto
        produto.nome = "Dior Sauvage";
        produto.setPreco(840.90);
        produto.ExibeFichaProduto();
        produto.aplicaDesconto();

        //Aluno
        aluno.nomeAluno = "Mohammed";
        aluno.setNota1(8);
        aluno.setNota2(6.5);
        aluno.setNota3(9);
        aluno.exibeFichaAluno();

        //Livro
        livro.exibeFichaLivro();

    }
}
