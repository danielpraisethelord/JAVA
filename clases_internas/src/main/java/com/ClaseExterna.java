package com;

public class ClaseExterna {
    private String hola;

    public void metodoEjempplo() {
        System.out.println("Esto es un metodo de la clase externa");
    }

    public class ClaseInterna {
        private String adios;

        public void metodoInterno() {
            System.out.println("Esto es un metodo de la clase interna");
        }
    }
}
