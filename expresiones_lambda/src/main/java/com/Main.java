package com;

public class Main {
    public static void main(String[] args) {
        Ejecutor claseAnonima = new Ejecutor() {
            @Override
            public void ejecutar(String parametro) {
                System.out.println("Hola desde " + parametro);
            }
        };

        Ejecutor lambdaEjecutor = (parametro) -> {
            System.out.println("Hola desde nuestra " + parametro);
        };

        Ejecutor lamEjecutor2 = (parametro) -> System.out.println("Hola desde la " + parametro + " mas sencilla");
        
        claseAnonima.ejecutar("Clase anonima");
        lambdaEjecutor.ejecutar("Clase lambda");
        lamEjecutor2.ejecutar("Clase lambda");
    }
}