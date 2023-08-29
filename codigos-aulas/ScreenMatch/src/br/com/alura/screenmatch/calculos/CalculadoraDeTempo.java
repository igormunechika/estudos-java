package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoMin();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoMin();
//    }

    public void inclui(Titulo ti){
//        System.out.println("Incluido tempo do titulo: "+ti);
        this.tempoTotal += ti.getDuracaoMin();
    }
}
