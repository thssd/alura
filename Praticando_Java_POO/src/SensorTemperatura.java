public class SensorTemperatura {

    String local;
    double temperatura;

    public void sesor(double temperatura){
        if (temperatura >= 37.5){
            System.out.println("Alerta! Temperatura acima do limite.");
        }
    }

    public void exibeTemperatura(){
        System.out.println("\nLocal: " + local);
        System.out.println("Temperatura: " + temperatura);
    }
}
