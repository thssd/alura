package exercicios;

import com.google.gson.Gson;

public class Terminal {
    static void main() {

        //1
        String json = "{nome=Fernando, idade=20, cidade=SãoPaulo}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);


        //2
        String jsonLivro = "{\"titulo\"=\"Harry+Potter\",\"autor\"=\"J.K+Rowling\",\"editora\":{\"nome\"=\"Cosco\"}}";

        Gson gson1 = new Gson();
        Livro livro = gson1.fromJson(jsonLivro, Livro.class);

        System.out.println(livro);
    }
}
