public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private int base1;
    private int altura1;
    private int base2;
    private int altura2;

    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    public int getAltura2() {
        return altura2;
    }

    public void setAltura2(int altura2) {
        this.altura2 = altura2;
    }

    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    public int getAltura1() {
        return altura1;
    }

    public void setAltura1(int altura1) {
        this.altura1 = altura1;
    }

    @Override
    public double calcularArea() {
        return base1 * altura1;
    }

    @Override
    public double calcularPerimetro() {
        return (base2 * altura2) * 2;
    }
}
