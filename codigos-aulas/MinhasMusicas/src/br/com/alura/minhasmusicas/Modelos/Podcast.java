package br.com.alura.minhasmusicas.Modelos;

public class Podcast extends Audio {
    private String host;
    private String apresentador;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacoes() {
        if (this.getTotalDeCurtidas() > 100) {
            return 10;
        } else {
            return 8;
        }
    }
}
