package com.ejemplo3;

public class PesoMxObservador implements Observador {
    private double valorCambio = 19.07;
    private Subject sujeto;

    public PesoMxObservador(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("MX: " + (sujeto.getEstado()) * valorCambio);
    }

}
