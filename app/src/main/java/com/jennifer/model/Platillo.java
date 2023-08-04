package com.jennifer.model;

public class Platillo {

    private String nombre;
    private String descripcion;
    private double precio;
    private String urlImg;

    public Platillo(String nombre, String descripcion, double precio, String urlImg) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.urlImg = urlImg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
