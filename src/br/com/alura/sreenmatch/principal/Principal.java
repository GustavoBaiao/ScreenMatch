package br.com.alura.sreenmatch.principal;

import br.com.alura.sreenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.sreenmatch.calculos.FiltroRecomendacao;
import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        ;
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.avalia(8);
        lost.avalia(10);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2022);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(lost);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}
