public class ValidarSenha {

    private String nome;
    private int senha;

    public ValidarSenha(String nome) {
        this.nome = nome;
    }

    public void validarSenha(int senha){
        int i = 0;
        i++;
        if (senha == 12345 && i <= 3){
            System.out.println(senha + " Senha correta.");
        } else {
            System.out.println(senha + " Senha incorreta.");
        }
    }

    public String getNome() {
        return nome;
    }
}
