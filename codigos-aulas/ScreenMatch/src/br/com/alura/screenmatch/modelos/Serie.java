package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minurosPorEpisodio;



    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
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

    public int getMinurosPorEpisodio() {
        return minurosPorEpisodio;
    }

    public void setMinurosPorEpisodio(int minurosPorEpisodio) {
        this.minurosPorEpisodio = minurosPorEpisodio;
    }

    @Override
    public int getDuracaoMin() {
        return temporadas*episodiosPorTemporada*minurosPorEpisodio;
    }

    public String toString(){
        return "Serie: "+this.getNome()+" ("+this.getAnoDeLancamento()+")";
    }
}
