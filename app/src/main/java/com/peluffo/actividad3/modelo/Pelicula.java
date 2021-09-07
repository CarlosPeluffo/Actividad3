package com.peluffo.actividad3.modelo;

import java.util.List;

public class Pelicula {
    private String titulo;
    private String director;
    private String reparto;
    private String sinopsis;
    private int afiche;

    public Pelicula(String titulo, String director, String reparto, String sinopsis, int afiche) {
        this.titulo = titulo;
        this.director = director;
        this.reparto = reparto;
        this.sinopsis = sinopsis;
        this.afiche = afiche;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getAfiche() {
        return afiche;
    }

    public void setAfiche(int afiche) {
        this.afiche = afiche;
    }
}
