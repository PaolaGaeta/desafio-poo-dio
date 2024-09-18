package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso () {

    }

    public String getTitulo () {

        return titulo;
    }

    public void setTitulo (final String titulo) {

        this.titulo = titulo;
    }

    public String getDescricao () {

        return descricao;
    }

    public void setDescricao (final String descricao) {

        this.descricao = descricao;
    }

    public int getCargaHoraria () {

        return cargaHoraria;
    }

    public void setCargaHoraria (final int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString () {

        return "Curso{" + "titulo='" + titulo + '\'' + ", descricao='" + descricao + '\'' + ", cargaHoraria=" + cargaHoraria + '}';
    }

}
