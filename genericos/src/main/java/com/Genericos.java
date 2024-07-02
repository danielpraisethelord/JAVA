package com;

public class Genericos <TIPO /*extends Number*/>{

    private final TIPO tipoObjeto;

    public Genericos(TIPO tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public void mostrar() {
        System.out.println("Esta es la clase del generico: " + tipoObjeto.getClass().getName());
    } 

}
