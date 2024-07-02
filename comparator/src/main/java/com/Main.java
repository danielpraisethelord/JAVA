package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona(1, "Daniel Santiago", 20));
        lista.add(new Persona(2, "Daniel Santiago", 22));
        lista.add(new Persona(3, "Daniel Santiago", 19));
        lista.add(new Persona(4, "AAA", 12));

        //Collections.sort(lista, new NombreComparator());

        /*Collections.sort(lista, new Comparator<Persona>(){
            @Override
            public int compare (Persona per1, Persona per2) {
                int rpta = 0;
                if (per1.getEdad() > per2.getEdad()) {
                    rpta = 1;
                } else {
                    rpta = -1;
                }
                return rpta;
            }
        }); */

        //Collections.sort(lista, (per1, per2) -> Integer.compare(per1.getEdad(), per2.getEdad()));
        Collections.sort(lista, Comparator.comparing(Persona::getEdad));
        
        for (Persona p : lista) {
            System.out.println(p);
        }
    }
}