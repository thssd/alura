import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalvadorEndereco {

    public void salvaArquivo(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        List<Endereco> listaDeEnderecos = new ArrayList<>();
        listaDeEnderecos.add(endereco);
        FileWriter escrita = new FileWriter(endereco.logradouro() + ".json");
        escrita.write(gson.toJson(listaDeEnderecos));
        escrita.close();
    }
}
