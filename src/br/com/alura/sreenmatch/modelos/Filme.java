package br.com.alura.sreenmatch.modelos;

import br.com.alura.sreenmatch.calculos.Classificavel;

public class Filme  extends  Titulo implements Classificavel {
    private  String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegMedia() / 2;
    }

    @Override
    public String toString() {
        return "Fimle: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
