import java.util.Scanner;

public class Leitor {
    static void main() {
        Scanner leitor = new Scanner (System.in);

        String a = "Java";
        String b = "Java";

        if (a.equals(b)) {
            System.out.println("As Strings são iguais.");
        } else {
            System.out.println("As Strings são diferentes.");
        }
    }
}
