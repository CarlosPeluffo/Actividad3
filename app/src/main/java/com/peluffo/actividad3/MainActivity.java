package com.peluffo.actividad3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.peluffo.actividad3.modelo.Cartelera;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcPeliculas;
    private PeliculaAdapter adapter;
    private Cartelera cartelera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcPeliculas = findViewById(R.id.rVPelicula);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        rcPeliculas.setLayoutManager(gridLayoutManager);
        cartelera = new Cartelera();
        adapter = new PeliculaAdapter(cartelera.cargarPeliculas(), this, getLayoutInflater());
        rcPeliculas.setAdapter(adapter);
    }
}