package com.frg.pruebaexamen;

import android.annotation.SuppressLint;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class PeliculaAdapter extends ListAdapter<Pelicula, PeliculaViewHolder>{

    protected PeliculaAdapter() {
        super(new DiffUtil.ItemCallback<Pelicula>() {
            @Override
            public boolean areItemsTheSame(@NonNull Pelicula oldItem, @NonNull Pelicula newItem) {
                return oldItem.getId() == newItem.getId();
            }

            @SuppressLint("DiffUtilEquals")
            @Override
            public boolean areContentsTheSame(@NonNull Pelicula oldItem, @NonNull Pelicula newItem) {
                return oldItem.equals(newItem);
            }
        });
    }

    @NonNull
    @Override
    public PeliculaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return PeliculaViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculaViewHolder holder, int position) {
        Pelicula current = getItem(position);
        holder.render(current);
    }

}
