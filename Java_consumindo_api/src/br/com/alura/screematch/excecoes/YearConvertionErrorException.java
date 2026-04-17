package br.com.alura.screematch.excecoes;

public class YearConvertionErrorException extends RuntimeException {
    private String mensagem;

    public YearConvertionErrorException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMessage() {
        return this.mensagem;
    }
}
