public class Main {
    static void main() {
        String nome = "João";
        double salario = 2890.0;
        int dependentes = 2;
        boolean isento = false;

        if (salario > 2500 && !isento) {
            double irrf = salario / 100 * 7.5;
            System.out.printf("Valor irrf: %.2f", irrf);
        } else if (isento) {
            System.out.println("Contribuinte isento de irrf.");
        } else {
            System.out.println("Valor há valores de irrf.");
        }
    }
}
