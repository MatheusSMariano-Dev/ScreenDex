package br.alura.screenmatch.modelos;


import br.alura.screenmatch.calculos.Classificacao;

public class Series extends Titulo implements Classificacao {

    public Series(String nome, int anoDeLancamento) {

        super(nome, anoDeLancamento);
    }
    private int temporadas;
    private int episodiosPorTemporada;

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    private boolean ativa;
    private int minutosPorEpisodio;


    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public int getClassificado() {
        return 0;
    }
        @Override
       public String toString(){
            return " Serie " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
        }

    }






