public class Pontos {

    private String nome;
    private int pontos = 0;

    public Pontos(String nome) {
        this.nome = nome;
    }

    public int ganharPontos(int entra){
        return pontos += entra;
    }

    public void exibirStatus(){
        if (pontos >= 0 && pontos <= 99){
            System.out.println("Pontos: " + pontos);
            System.out.println("Nivel: 1");
        } else if (pontos >= 100 && pontos <= 199){
            System.out.println("Pontos: " + pontos);
            System.out.println("Nivel: 2");
        } else if (pontos >= 200 && pontos <= 299) {
            System.out.println("Pontos: " + pontos);
            System.out.println("Nivel: 3");
        }
    }

    public String getNome() {
        return nome;
    }
}
