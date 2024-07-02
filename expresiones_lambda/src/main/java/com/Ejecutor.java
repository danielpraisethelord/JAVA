package com;

@FunctionalInterface
public interface Ejecutor {
    void ejecutar(String parametro);
    default void metodoDefecto() {

    }

    static void metodoEstatico() {

    }
} 
