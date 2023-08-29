package br.com.alura.screenmatch.calculos;

public class FiltroDeRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao()>=4){
            System.out.println("Entre os mais assistidos");
        }else if ((classificavel.getClassificacao()<4) && (classificavel.getClassificacao()<=2)){
            System.out.println("Boa recomendação");
        }else {
            System.out.println("Pouco assistido");
        }
    }
}
