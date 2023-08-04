package com.jennifer.model;

public class DetallePlatillo extends Platillo{

    private String ingrediente;

    public DetallePlatillo(String nombre, String descripcion, double precio,
                           String urlImg, String ingrediente) {
        super(nombre, descripcion, precio, urlImg);
        this.ingrediente = ingrediente;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
}
