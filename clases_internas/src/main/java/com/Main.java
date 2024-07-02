package com;

public class Main {
    public static void main(String[] args) {
        ClaseExterna claseExterna = new ClaseExterna();
        ClaseExterna.ClaseInterna claseInterna = claseExterna.new ClaseInterna();

        ClaseEstatica.ClaseInternaEstatica claseInternaEstatica = new ClaseEstatica.ClaseInternaEstatica();

        claseExterna.metodoEjempplo();
        claseInterna.metodoInterno();
        claseInternaEstatica.metodoInternoEstatico();

        class ClaseLocal {
            void mostrar() {
                System.out.println("Clase Local");
            }
        }

        ClaseLocal claseLocal = new ClaseLocal();
        claseLocal.mostrar();
    }
}