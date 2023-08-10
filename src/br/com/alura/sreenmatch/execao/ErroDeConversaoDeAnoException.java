package br.com.alura.sreenmatch.execao;

public class ErroDeConversaoDeAnoException extends RuntimeException {

    private String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
