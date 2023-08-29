package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão",1970);
//        meuFilme.setNome("O poderoso Chefão");
//        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoMin(280);

        Filme outroFilme = new Filme("Avatar",1970);
//        outroFilme.setNome("Avatar");
//        outroFilme.setAnoDeLancamento(1970);
        outroFilme.setDuracaoMin(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        System.out.println("Quantidade de avaliações: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media de avaliações: "+meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("Lost",2000);
//        minhaSerie.setNome("Lost");
//        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setMinurosPorEpisodio(50);
        minhaSerie.setEpisodiosPorTemporada(10);
        System.out.println("Duração total serie: "+minhaSerie.getDuracaoMin());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(400);

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();

        filtro.filtra(meuFilme);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.setDuracaoMin(200);
//        filmeDoPaulo.setNome("Dogville");
//        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme: "+listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: "+ listaDeFilmes.get(0).toString());

    }
}
