package com.frg.pruebaexamen;

public class Pelicula {
    private final int id;
    private final String titulo;
    private final String urlImagen;

    public Pelicula(int id, String titulo, String urlImagen) {
        this.id = id;
        this.titulo = titulo;
        this.urlImagen = urlImagen;
    }

    public int getId() { return id; }

    public String getTitulo() {
        return titulo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }
}
