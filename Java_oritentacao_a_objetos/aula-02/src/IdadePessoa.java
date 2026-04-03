//Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

public class IdadePessoa {

    public String nome;
    private int idade;
    private boolean maioridade;

    //Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isMaioridade() {
        return maioridade;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMaioridade(boolean maioridade) {
        this.maioridade = maioridade;
    }

    //Metodo para verificar se é maior de idade
    public boolean verificaIdade(){
        if (idade >= 18){
            return maioridade = true;
        } else {
            return false;
        }
    }

    //Exibir as informações
    public void exibeIdadePessoa(){
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("È maior de idade: " + verificaIdade());
    }
}
