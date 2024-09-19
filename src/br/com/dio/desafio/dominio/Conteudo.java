package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getDescricao () {

        return descricao;
    }

    public void setDescricao (final String descricao) {

        this.descricao = descricao;
    }

    public String getTitulo () {

        return titulo;
    }

    public void setTitulo (final String titulo) {

        this.titulo = titulo;
    }

}
