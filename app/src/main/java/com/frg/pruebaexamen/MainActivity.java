package com.frg.pruebaexamen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<Pelicula> peliculas = obtenerListaPeliculas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvPeliculas);
        PeliculaAdapter adapter = new PeliculaAdapter(peliculas);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }

    //metodo que devuelve una lista de peliculas
    private List<Pelicula> obtenerListaPeliculas() {
        List<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(new Pelicula(0, "Terminator 2", "https://pics.filmaffinity.com/t2_terminator_2_judgment_day-825143697-msmall.jpg"));
        listaPeliculas.add(new Pelicula(1, "Regreso al futuro", "https://pics.filmaffinity.com/back_to_the_future-100822308-msmall.jpg"));
        listaPeliculas.add(new Pelicula(2, "Alien, el octavo pasajero", "https://pics.filmaffinity.com/alien-657278575-msmall.jpg"));
        listaPeliculas.add(new Pelicula(3, "Matrix", "https://pics.filmaffinity.com/the_matrix-155050517-msmall.jpg"));
        listaPeliculas.add(new Pelicula(4, "Interstellar", "https://pics.filmaffinity.com/interstellar-366875261-msmall.jpg"));
        listaPeliculas.add(new Pelicula(5, "Akira", "https://pics.filmaffinity.com/akira-262742931-mmed.jpg"));
        listaPeliculas.add(new Pelicula(6, "Pacific Rim", "https://pics.filmaffinity.com/pacific_rim-524748435-msmall.jpg"));
        listaPeliculas.add(new Pelicula(7, "Avatar", "https://pics.filmaffinity.com/avatar-208925608-msmall.jpg"));
        listaPeliculas.add(new Pelicula(8, "Blade Runner", "https://pics.filmaffinity.com/blade_runner-351607743-msmall.jpg"));
        listaPeliculas.add(new Pelicula(9, "The Thing", "https://pics.filmaffinity.com/the_thing-823700381-msmall.jpg"));
        // Añadir más películas según sea necesario
        return listaPeliculas;
    }
};