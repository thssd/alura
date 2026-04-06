public class Servico implements Vendaval{
    private int limpeza;
    private int duracaoEmHoras;

    public int getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(int limpeza) {
        this.limpeza = limpeza;
    }

    public int getDuracaoEmHoras() {
        return duracaoEmHoras;
    }

    public void setDuracaoEmHoras(int duracaoEmHoras) {
        this.duracaoEmHoras = duracaoEmHoras;
    }

    @Override
    public double precoFinal() {
        if (duracaoEmHoras >= 2){
            return limpeza + 10;
        } else if (duracaoEmHoras >= 1){
            return limpeza + 5;
        } else {
            return limpeza;
        }
    }
}
