package br.com.alura.desafioC;

public class NumeroPrimo {

    public static boolean verificaPrimo(int numero){
        if (numero < 2) return false;
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
