package br.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtro(Classificacao classificacao) {
    if (classificacao.getClassificado() >= 4) {
        System.out.println("Está entre os preferidos do momento");

         } else if (classificacao.getClassificado() >= 2) {
        System.out.println("Muito bem avaliado no momento");
       }
        else {
        System.out.println("Está em baixa no momento");


    }
    }
    }





