package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso Chefão",1970);
        filme1.avalia(9);
        Filme filme2 = new Filme("Avatar",1970);
        filme2.avalia(4);
        var filme3 = new Filme("Dogville",2003);
        filme3.avalia(7);
        Serie serie1 = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filme3);
        lista.add(filme1);
        lista.add(filme2);
        lista.add(serie1);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
//            Filme filme = (Filme) item;//desclarada dentro do if
            //Evitar erro, pois serie nao possui atributo classificacao
            if (item instanceof Filme filme && filme.getClassificacao()>2) {//Verifica se o item é um Filme
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Ordem alfabetica: "+buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista ordem alfabetica: "+lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordem ano de lancamento: "+lista);




    }
}
