import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Encontra {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o texto");
        String texto = leitor.nextLine();

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> listaHashtags = new ArrayList<>();

        while (matcher.find()){
            listaHashtags.add(matcher.group());
        }

        if (listaHashtags.isEmpty()){
            System.out.println("Nenhuma hastag encontrada");
        } else {
            System.out.println("Hashtags encontradas: " + String.join(", ", listaHashtags ));
        }
    }
}
