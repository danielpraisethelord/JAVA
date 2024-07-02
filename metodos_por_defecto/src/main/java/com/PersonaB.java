package com;

public interface PersonaB {
    default public void hablar() {
        System.out.println("Saludos papus - PersonaB");
    }
}
