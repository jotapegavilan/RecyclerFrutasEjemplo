package com.gavilan.recyclerviewejemplo.model;

public class Fruta {
    // atributos
    private String nombre;
    private double precio_unitario;
    // constructores
    public Fruta(){

    }
    public Fruta(String nom, double pr){
        this.nombre = nom;
        this.precio_unitario = pr;
    }
    // accesadores
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio_unitario(){
        return this.precio_unitario;
    }
    // mutadores
    public void setNombre(String newName){
        this.nombre = newName;
    }
    public void setPrecio_unitario(double newPrecio){
        this.precio_unitario = newPrecio;
    }
}
