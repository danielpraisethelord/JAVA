package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
            new Persona("Alfredo", 20, "CDMMX"),
            new Persona("Raul", 22, "Monterrey"),
            new Persona("Daniel", 24, "Tijuana")
        );

        List <Integer> ages = new ArrayList<>();

        for (Persona p : personas) {
            ages.add(p.getEdad());
        }

        System.out.println(ages);

        /*OTRA FORMA DE HACERLO CON STREAM */

        List<Integer> ages2 = personas.stream().map(Persona -> Persona.getEdad()).collect(Collectors.toList());
        List<Integer> ages3 = personas.stream().map(Persona::getEdad).collect(Collectors.toList());
        System.out.println(ages2);
        System.out.println(ages3);

        List<Persona2> persona2 = personas.stream().map(Persona -> new Persona2(Persona.getNombre(), Persona.getEdad(), Persona.getCiudad())).collect(Collectors.toList());
        System.out.println(persona2);
    }
}