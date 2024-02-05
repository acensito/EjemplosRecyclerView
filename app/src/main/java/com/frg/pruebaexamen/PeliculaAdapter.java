package com.frg.pruebaexamen;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaViewHolder> {

    private final List<Pelicula> peliculas;

    public PeliculaAdapter(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @NonNull
    @Override
    public PeliculaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return PeliculaViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculaViewHolder holder, int position) {
        Pelicula current = peliculas.get(position);
        holder.render(current);
    }

    @Override
    public int getItemCount() {  return peliculas.size(); }

}
