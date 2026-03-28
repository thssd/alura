import java.util.Scanner;

public class CodigoAcesso {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int p1 = 1;
        int p3 = 3;

        System.out.println("Digite o código de acesso");
        int codigo = leitor.nextInt();
        System.out.println("Digite o nível de permissão");
        int nivel = leitor.nextInt();

        boolean codigoAcesso = codigo == 2023;
        boolean nivelPermissao = nivel >= p1 && nivel <= p3;

        if (codigoAcesso && nivelPermissao){
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso negado.");
            if (!codigoAcesso){
                System.out.println("Codigo de acesso negado.");
            }
            if (!nivelPermissao){
                System.out.println("Nível de permissão negado.");
            }
        }
    }
}
