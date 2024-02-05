package com.frg.pruebaexamen;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.frg.pruebaexamen.databinding.ItemPeliculaBinding;

public class PeliculaViewHolder extends RecyclerView.ViewHolder {

    ItemPeliculaBinding bind;

    public PeliculaViewHolder(@NonNull View itemView) {
        super(itemView);
        bind = ItemPeliculaBinding.bind(itemView);
    }

    public void render(Pelicula pelicula) {
        Glide.with(itemView).load(pelicula.getUrlImagen()).into(bind.portada);
    }

    public static PeliculaViewHolder create(ViewGroup parent) {
        View view = View.inflate(parent.getContext(), R.layout.item_pelicula, null);
        return new PeliculaViewHolder(view);
    }
}
