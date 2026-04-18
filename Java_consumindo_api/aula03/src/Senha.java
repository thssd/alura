import java.util.Scanner;

public class Senha {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = leitor.nextLine();

        try {
            validaSenha(senha);
        } catch (SenhaInvalidaException e){
            System.out.println("Imprevisto: " + e.getMessage());
        }

    }
    public static void validaSenha(String senha){
        if (senha.length() < 8){
            throw new SenhaInvalidaException ("Senha inválida.");
        }
    }
}
