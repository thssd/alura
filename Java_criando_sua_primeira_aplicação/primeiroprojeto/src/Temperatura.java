public class Temperatura {
    public static void main (String[] args){
    double c = 25.4; //t = Temperatura em celsius
    double f = (c * 1.8) + 32;//f = Temperatura em farenheit
    String mensagem = String.format("A temperatura de %f graus celsius em graus Farenheit é: %.2f", c, f);
        System.out.println(mensagem);
    }
}
