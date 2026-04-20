public class Bateria {

    private int bateria;

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void validaBateria(int bateria){
        if (bateria < 0 && bateria > 100){
            System.out.println("Bateria inválida.");
        }
        else if (bateria <= 20){
            System.out.println("Bateria fraca.");
        } else if (bateria > 20 && bateria <= 80) {
            System.out.println("Bateria ok.");
        } else if (bateria > 80){
            System.out.println("Bateria cheia.");
        }
    }
}
