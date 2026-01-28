package br.alura.screenmatch.modelos;

import br.alura.screenmatch.calculos.Classificacao;

public class Episodios implements Classificacao {
    private int numero;
    private int String;
    private Series series;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    private int totalVisualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getString() {
        return String;
    }

    public void setString(int string) {
        String = string;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassificado() {
        if (totalVisualizacoes > 100) {
        return 4;

        }
        else {
            return 2;
        }
    }
}
