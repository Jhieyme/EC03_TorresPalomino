package com.jennifer.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jennifer.databinding.FragmentHomeBinding;
import com.jennifer.model.Platillo;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RVAdapter adapter  = new RVAdapter(getData());
        binding.rvMoviesResume.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        binding.rvMoviesResume.setLayoutManager(layoutManager);
    }

    private List<Platillo> getData() {
        List<Platillo> platillos = new ArrayList<>();

        platillos.add(new Platillo("Ceviche mixto", "Incluye pesocado y cebolla", 49.99, "https://www.peruhop.com/wp-content/uploads/ceviche.jpg"));
        platillos.add(new Platillo("Causa rellena", "Rellena de pollo y verduras", 29.99, "https://www.jamear.com/wp-content/uploads/2022/05/seamkT9FGWXvo9GpHM63n5up-2048x1253.jpeg"));
        platillos.add(new Platillo("Estofado de pollo", "Plato con guiso y pollo", 26.99, "https://www.jamear.com/wp-content/uploads/2022/05/estofado-de-pollo.jpg"));
        platillos.add(new Platillo("Olluquito", "Con carne y arroz", 35.99, "https://www.jamear.com/wp-content/uploads/2022/05/image41-2048x1146.jpg"));
        platillos.add(new Platillo("Cau cau", "Plato acompañado de arroz blanco", 28.99, "https://www.jamear.com/wp-content/uploads/2022/05/cau-cau-plato-tipico-de-peru-2048x1152.jpg"));
        platillos.add(new Platillo("Tallarines verdes", "Inlcuye bistec o pollo", 27.99, "https://i.ytimg.com/vi/enxbUqDbq2g/sddefault.jpg"));
        platillos.add(new Platillo("Bistec a lo pobre", "Plato super completo", 45.99, "https://decomidaperuana.com/wp-content/uploads/2020/02/receta-de-bistec-a-lo-pobre.jpg"));
        platillos.add(new Platillo("Escabeche de pescado", "Alimentos en vinagre y azúcar", 30.99, "https://decomidaperuana.com/wp-content/uploads/2020/04/escabeche-de-pescado.jpg"));
        platillos.add(new Platillo("Trucha frita", "Deliciosa trucha frita", 40.99, "https://media-cdn.tripadvisor.com/media/photo-s/1c/a0/05/4f/trucha-frita-todos-nuestros.jpg"));
        platillos.add(new Platillo("Arroz tapado", "Incluye huevo y platano frito", 42.99, "https://decomidaperuana.com/wp-content/uploads/2019/11/receta-de-arroz-tapado.jpg"));
        return platillos;
    }



}