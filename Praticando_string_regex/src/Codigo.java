import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Codigo {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o codigo:");
        String codigo = leitor.next();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(codigo);

        if (matcher.matches()){
            System.out.println("O codigo esta valido");
        } else {
            System.out.println("O codigo esta invalido");
        }
    }
}
