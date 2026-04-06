public class Carro {

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void defineModelo(String modelo){
        this.modelo = modelo;
    }

    public void definePreco(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    private double calculaMenorPreco(){
        double menorPreco = precoAno1;
        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        } if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    private double calculaMaiorPreco(){
        double maiorPreco = precoAno1;
        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        } if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public void exibirFichaCarro(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Preço no primeiro ano: " + precoAno1);
        System.out.println("Preço no segundo ano: " + precoAno2);
        System.out.println("Preço no terceiro ano: " + precoAno3);
        System.out.println("Menor preço: " + calculaMenorPreco());
        System.out.println("Maior preço: " + calculaMaiorPreco());
    }
}
