package com;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(10);
        persona.setNombre("Daniel");
        System.out.println(persona);

        Persona persona2 = Persona.builder()
            .nombre("Papu")
            .edad(10)
            .build();
        System.out.println(persona2);
    }
}