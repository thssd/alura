public class Luz implements Controlavel{
    private boolean estadoInicial = false;

    @Override
    public void ligar() {
        if (!estadoInicial){
            estadoInicial = true;
            System.out.println("\n\nLuz ligada.");
        } else {
            System.out.println("A Luz já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (estadoInicial){
            System.out.println("Luz desligada.");
        } else {
            System.out.println("A luz já está desligada.");
        }
    }
}
