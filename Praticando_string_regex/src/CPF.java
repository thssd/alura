import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPF {
    static void main() {
        Scanner leitor= new Scanner(System.in);

        System.out.println("Digite o CPF");
        String cpf = leitor.next();

        Pattern pattern = Pattern.compile("^\\d{3}.\\d{3}.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()){
            System.out.printf("O CPF: %s é válido.", cpf);
        } else {
            System.out.printf("CPF inválido.");
        }
    }
}
