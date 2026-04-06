public class TabuadaMultiplicacao implements Tabuada{
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int mostrarTabuada() {
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(resultado = numero * i);
        }
        return resultado;
    }
}
