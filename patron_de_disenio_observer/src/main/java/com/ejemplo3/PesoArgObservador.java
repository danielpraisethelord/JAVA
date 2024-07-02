package com.ejemplo3;

public class PesoArgObservador implements Observador{
    private double valorCambio = 29.86;
    private Subject sujeto;

    public PesoArgObservador(Subject subject) {
        this.sujeto = subject;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("ARG: " + (sujeto.getEstado()) * valorCambio);
    }

}
    
