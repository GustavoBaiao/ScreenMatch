package br.com.alura.sreenmatch.modelos;

import br.com.alura.sreenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private String seire;

    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSeire() {
        return seire;
    }

    public void setSeire(String seire) {
        this.seire = seire;
    }

    public void setNumero(int numero) {
        this.numero = numero;


    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
