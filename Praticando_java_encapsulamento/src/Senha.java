public class Senha {

    private String senha;

    public Senha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha, String senhaNova) {
        if (this.senha == senha){
            System.out.println("Senha alterada com sucesso.");
            this.senha = senhaNova;
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada");
        }
    }
}
