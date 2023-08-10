package br.com.alura.sreenmatch.principal;

import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Serie;
import br.com.alura.sreenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);

        Serie lost = new Serie("Lost", 2000);

        Filme outroFilme = new Filme("Avatar", 2022);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item:lista) {
            System.out.println(item);
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
