package com;

public interface PersonaA {
    public void caminar();
    
    default public void hablar() {
        System.out.println("Saludos papus - PersonaA");
    }
}
