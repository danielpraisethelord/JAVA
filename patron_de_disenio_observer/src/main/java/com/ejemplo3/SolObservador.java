package com.ejemplo3;

public class SolObservador implements Observador {
    private double valorCambio = 3.25;
    private Subject sujeto;
    
    public SolObservador (Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("PEN: " + (sujeto.getEstado()) * valorCambio);
    }
}
