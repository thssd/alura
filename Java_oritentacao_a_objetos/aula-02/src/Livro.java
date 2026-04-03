public class Livro {

    private String autor = "J.R Tolkien";
    private String titulo = "Hobbit";
    private int numeroPaginas = 600;
    private double preco = 78.90;
    private boolean bestSeller = true;

    //Getters
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }

    //Setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setBestSeller(boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    //Metodo para exibir as informações
    public void exibeFichaLivro(){
        System.out.println("\nAutor: " + autor);
        System.out.println("Título: " + titulo);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Preço: " + preco);
        System.out.println("Best Seller: " + bestSeller);
    }

}
