import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Terminal {
    static void main() throws IOException {
        Titulo titulo = new Titulo();
        Veiculo veiculo = new Veiculo();


        //exercicio 1
        titulo.setNome("The godfather");
        titulo.setAnoDeLancamento(1972);
        titulo.setDuracaoEmMin(175);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter serializacao = new FileWriter("objetosSerializados");

        serializacao.write(gson.toJson(titulo));

        //exercicio 2
        veiculo.setMarca("Honda");
        veiculo.setModelo("Civic");
        veiculo.setAno(2021);

        serializacao.write(gson.toJson(veiculo));
        serializacao.close();
    }
}
