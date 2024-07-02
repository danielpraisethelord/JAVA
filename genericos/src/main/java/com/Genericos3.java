package com;

import java.util.List;

public class Genericos3 {
    
    public void mostrar (List<? extends Number> lista) {
        for (Number number: lista) {
            System.out.println("Esta es la clase del generico: " + number.getClass().getName());
        }
    }
}
