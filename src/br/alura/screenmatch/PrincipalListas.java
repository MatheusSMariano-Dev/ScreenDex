package br.alura.screenmatch;

import br.alura.screenmatch.modelos.Filme;
import br.alura.screenmatch.modelos.Series;
import br.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);
        Filme outroFime = new Filme("IT Capitulo 2", 2019);
        outroFime.avalia(8);
        var filmeDoMatheus = new Filme("O poderoso chefão", 1970);
        filmeDoMatheus.avalia(11);
        Series Dexter = new Series("Dexter", 2006);
        Dexter.avalia(10);

        ArrayList<Titulo> Lista = new ArrayList<>();
        Lista.add(favorito);
        Lista.add(outroFime);
        Lista.add(filmeDoMatheus);
        Lista.add(Dexter);
        for (Titulo item: Lista) {

            System.out.println(item.getNome());
          if (item instanceof Filme filme && filme.getClassificado() > 2 )
            System.out.println("Classificação: " + filme.getClassificado());


        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Alpacino");
        buscaPorArtista.add("Matheus");
        buscaPorArtista.add("Lucas");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenado");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(Lista);
        System.out.println(Lista);
        Lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento");
        System.out.println(Lista);
    }


}
