package com;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", LocalDate.now());
        System.out.println(persona);
        PersonaDto personaDto = new PersonaDto("Maria", LocalDate.now(), "Calle 123");
        System.out.println(personaDto);
    }
}