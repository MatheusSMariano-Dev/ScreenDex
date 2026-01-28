package br.alura.screenmatch.principal;

import br.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.alura.screenmatch.calculos.FiltroRecomendacao;
import br.alura.screenmatch.modelos.Episodios;
import br.alura.screenmatch.modelos.Filme;
import br.alura.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);

        favorito.setNome("The Matrix");
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.exibeFichaTecnica();
        favorito.avalia(50);
        favorito.avalia(55);
        favorito.avalia(555);
        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());

        System.out.println();

        Filme outroFime = new Filme("IT Capitulo 2", 2019);
        outroFime.setNome("IT Capitulo 2");
        outroFime.setDuracaoEmMinutos(165);
        outroFime.setIncluidoNoPlano(false);
        outroFime.exibeFichaTecnica();
        outroFime.avalia(40);
        outroFime.avalia(60);
        outroFime.avalia(80);
        System.out.println("Média de avaliações do filme: " +outroFime.pegaMedia());


        System.out.println();

        Series Dexter = new Series("Dexter", 2006);
        Dexter.setTemporadas(10);
        Dexter.setDuracaoEmMinutos(50);
        Dexter.setEpisodiosPorTemporada(10);
        Dexter.setIncluidoNoPlano(true);
        Dexter.setMinutosPorEpisodio(50);
        Dexter.setNome("Dexter");
        Dexter.exibeFichaTecnica2();
        System.out.println("Duração media dos episodios: " + Dexter.getDuracaoEmMinutos());

        System.out.println();

        Series supernatural = new Series("Supernatural", 2005);
        supernatural.setTemporadas(15);
        supernatural.setDuracaoEmMinutos(45);
        supernatural.setEpisodiosPorTemporada(20);
        supernatural.setIncluidoNoPlano(true);
        supernatural.setMinutosPorEpisodio(45);
        supernatural.setNome("Supernatural");
        supernatural.exibeFichaTecnica2();

        System.out.println("Duração média dos episódios: " + supernatural.getDuracaoEmMinutos());




        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(Dexter);
        System.out.println("o tempo total é " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(favorito);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSeries(Dexter);
        episodios.setTotalVisualizacoes(300);
        filtro.filtro(episodios );

        var filmeDoMatheus = new Filme("O poderoso chefão", 1970);
        filmeDoMatheus.setDuracaoEmMinutos(200);
        filmeDoMatheus.setNome("O poderoso chefão");
        filmeDoMatheus.avalia(10);

        System.out.println();

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(filmeDoMatheus);
        listaDeFilmes.add(outroFime);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("Tostring : " + listaDeFilmes.get(0).toString());

        ArrayList<Series> listaDeSeries = new ArrayList<>();
        listaDeSeries.add(Dexter);
        listaDeSeries.add(supernatural);


    }



}