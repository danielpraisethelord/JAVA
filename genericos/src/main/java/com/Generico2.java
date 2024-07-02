package com;

public class Generico2 {
    
    public <TIPO, SEGUNDO> SEGUNDO mostrar (TIPO tipoObjeto, SEGUNDO tipoObj) {
        System.out.println("Esta es la clase del generico: " + tipoObjeto.getClass().getName());
        return tipoObj;
    }
}
