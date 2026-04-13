public class Jogadores extends Atleta{

    public Jogadores(String nome, int idade){
        super (nome, idade);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", idade: " + getIdade();
    }
}
