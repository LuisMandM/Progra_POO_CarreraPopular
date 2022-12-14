package com.ikasgela;

public class Marca {
    private final double tiempo;

    public Marca(double tiempo) {
        this.tiempo = tiempo;
    }

    //Asociaciones

    //A carrera
    private Carrera carrera;

    //A participante
    private Participante participante;

    //Getter and setter asociacion

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }


    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public double getTiempo() {
        return tiempo;
    }


}
