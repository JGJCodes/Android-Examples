package com.example.root.lista;


public class Actor {
    private String nombre;
    private int drawableImageID;
    private String descripcion;

    public Actor(String nombre, int drawableImageID, String descripcion) {
        this.nombre = nombre;
        this.drawableImageID = drawableImageID;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDrawableImageID() {
        return drawableImageID;
    }

    public void setDrawableImageID(int drawableImageID) {
        this.drawableImageID = drawableImageID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
