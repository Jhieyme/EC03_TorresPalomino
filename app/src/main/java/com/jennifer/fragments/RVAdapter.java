package com.jennifer.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jennifer.databinding.ItemListBinding;
import com.jennifer.model.Platillo;

import java.util.List;

import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ResumeVH>{

    private List<Platillo> platos;

    public  RVAdapter(List<Platillo> platos){

        this.platos = platos;
    }

    @NonNull
    @Override
    public ResumeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListBinding binding = ItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ResumeVH(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ResumeVH holder, int position) {
        holder.bind(platos.get(position));
    }

    @Override
    public int getItemCount() {
        return platos.size();
    }

    class ResumeVH extends RecyclerView.ViewHolder {
        private ItemListBinding binding;

        public ResumeVH(ItemListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Platillo platillo) {

            binding.txtNombre.setText(platillo.getNombre());
            binding.txtDescripcion.setText(platillo.getDescripcion());
            binding.txtPrecio.setText("S/. " + platillo.getPrecio());

            ImageLoader imageLoader = Coil.imageLoader(binding.getRoot().getContext());
            ImageRequest request = new ImageRequest.Builder(binding.getRoot().getContext())
                    .data(platillo.getUrlImg())
                    .crossfade(true)
                    .target(binding.img)
                    .build();
            imageLoader.enqueue(request);
        }
    }
}
