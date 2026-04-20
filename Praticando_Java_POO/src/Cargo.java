public class Cargo {

    String nome;
    String cargo;
    int nivelDeAcesso;
    int novoNivel;

    public String promove(){
        if (novoNivel == 2) {
            return cargo = "Desenvolvedor Pleno";
        } else if (novoNivel == 3){
            return cargo = "Desenvolvedor Senior";
        } else {
            return "0";
        }
    }

    public void exibeFichaFuncionario(){
        System.out.println("\nNome: " + nome);
        System.out.println("Profissão: desenvolvedor " + promove());
        System.out.println("Nívle de acesso: " + novoNivel);
    }
}
