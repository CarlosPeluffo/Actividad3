package com.peluffo.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.peluffo.actividad3.modelo.Pelicula;
import com.peluffo.actividad3.modelo.Cartelera;

import java.util.List;

public class Descripcion extends AppCompatActivity {
private TextView titulo, director, actores, sinopsis;
private ImageView portada;
private Cartelera cartelera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        iniciarVista();
    }
    private void iniciarVista(){
        cartelera = new Cartelera();
        titulo = findViewById(R.id.tvTitulo2);
        director = findViewById(R.id.tvDirector);
        actores = findViewById(R.id.tvActores);
        sinopsis = findViewById(R.id.tvSinopsis2);
        portada = findViewById(R.id.ivPortada);
        List<Pelicula> peliculas = cartelera.cargarPeliculas();
        int i = getIntent().getIntExtra("Item", 0);
        titulo.setText(peliculas.get(i).getTitulo());
        director.setText("Director: " + peliculas.get(i).getDirector());
        actores.setText("Reparto: " + peliculas.get(i).getReparto());
        sinopsis.setText("Sinopsis: " + peliculas.get(i).getSinopsis());
        portada.setImageResource(peliculas.get(i).getAfiche());
    }
}