package com;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add(123);

        // Casteo explícito
        String ejemplo = (String) lista.get(0); // Casteo de Object a String

        System.out.println(ejemplo); // Imprime: Hola

        // Este casteo lanzaría una ClassCastException en tiempo de ejecución
        try {
            Integer numero = (Integer) lista.get(1); // Casteo de Object a Integer
            System.out.println(numero); // Imprime: 123
        } catch (ClassCastException e) {
            System.out.println("Error de casteo: " + e.getMessage());
        }
    }
}
