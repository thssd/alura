public class ArCondicionado implements Controlavel{
    private boolean estadoInicial = false;

    @Override
    public void ligar() {
        if (!estadoInicial){
            estadoInicial = true;
            System.out.println("Ar Condicionado ligado.");
        } else {
            System.out.println("O Ar Condicionado já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (estadoInicial){
            System.out.println("Ar Condicionado desligado.");
        } else {
            System.out.println("O Ar Condicionado já está desligado.");
        }
    }
}
