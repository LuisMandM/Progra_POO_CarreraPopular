package com.ikasgela;

public class Participante {

    private String nombre;
    private int dorsal;

    public Participante(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }


    //Asociacion
    private Marca marca;


    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    //Getter and setter asociacion

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return String.format("%0,3d\t| %-15s\t|%.2f", dorsal, nombre, marca.getTiempo());
    }
}
