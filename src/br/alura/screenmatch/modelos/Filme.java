package br.alura.screenmatch.modelos;

import br.alura.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    private String diretor;


    @Override
    public int getClassificado() {
        return (int) pegaMedia() / 2;
    }
        public String toString() {
            return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
        }
    }

