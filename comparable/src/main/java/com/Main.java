package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> lista = Arrays.asList(
            new Persona(1, "Daniel Santiago", 20),
            new Persona(2, "Papuniel Santiago", 19),
            new Persona(3, "AAA", 30),
            new Persona(4, "ZZZ", 25)
        );

        Collections.sort((lista));
        System.out.println(lista);
    }
}