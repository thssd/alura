public class Classificador {
    static void main() {
        double preco = 50;

        if (preco <= 50.00){
            System.out.println("Categoria do produto: Economico.");
        } else if (preco > 50.01 && preco <= 200.00){
            System.out.println("Categoria do produto: Intermediário.");
        } else
            System.out.println("Categoria do produto: Premium.");
    }
}
