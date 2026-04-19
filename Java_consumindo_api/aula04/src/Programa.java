import java.io.FileWriter;
import java.io.IOException;

public class Programa {
    static void main() throws IOException {

        FileWriter escrita = new FileWriter("arquivo.txt");
        escrita.write("Conteúdo a ser gravado no arquivo.");
        escrita.close();
    }
}
